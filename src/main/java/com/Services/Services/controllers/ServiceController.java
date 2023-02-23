package com.Services.Services.controllers;


import com.Services.Services.dtos.CCustodto;
import com.Services.Services.dtos.Servicedto;
import com.Services.Services.models.CCustoModel;
import com.Services.Services.models.ServicesModel;
import com.Services.Services.services.Serviceservice;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/services")
public class ServiceController {

    final Serviceservice serviceservice;

    public ServiceController(Serviceservice serviceservice){
        this.serviceservice = serviceservice;
    }

    @PostMapping
    public ResponseEntity<Object> saveService(@RequestBody @Valid Servicedto servicedto){

        if(serviceservice.existsByname(servicedto.getName())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Name is already in use!");
        }
        if(serviceservice.existsBycontact(servicedto.getContact())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Contact is already in use!");
        }

        var servicesModel = new ServicesModel();
        BeanUtils.copyProperties(servicedto, servicesModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceservice.save(servicesModel));
    }

    @GetMapping
    public ResponseEntity<List<ServicesModel>> getAllServices(){
        return ResponseEntity.status(HttpStatus.OK).body(serviceservice.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneServices(@PathVariable(value = "id") UUID id){
        Optional<ServicesModel> servicesModelOptional= serviceservice.findById(id);

        if (!servicesModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nao encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(servicesModelOptional.get());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteService(@PathVariable(value = "id") UUID id){
        Optional<ServicesModel> servicesModelOptional= serviceservice.findById(id);
        if (!servicesModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nao encontrado");
        }
        serviceservice.delete(servicesModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Parking Spot deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateService(@PathVariable(value = "id") UUID id,@RequestBody @Valid Servicedto servicedto){
        Optional<ServicesModel> cCustoModelOptional = serviceservice.findById(id);
        if (!cCustoModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found.");
        }
        var ServiceModel = new ServicesModel();
        BeanUtils.copyProperties(servicedto, ServiceModel);
        ServiceModel.setId(cCustoModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(serviceservice.save(ServiceModel));
    }



}



