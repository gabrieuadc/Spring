package com.Services.Services.controllers;

import com.Services.Services.dtos.CCustodto;
import com.Services.Services.models.CCustoModel;
import com.Services.Services.models.ServicesModel;
import com.Services.Services.services.CCustoService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/ccustos")

public class CCustoController {

    final CCustoService cCustoService;

    public CCustoController(CCustoService cCustoService){
        this.cCustoService= cCustoService;
    }

    @PostMapping
    public ResponseEntity<Object> saveCcustos(@RequestBody @Valid CCustodto cCustodto){

        var ccustosModel= new CCustoModel();
        BeanUtils.copyProperties(cCustodto, ccustosModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(cCustoService.save(ccustosModel));
    }

    @GetMapping
    public ResponseEntity <List<CCustoModel>> getAllCcustos(){
        return ResponseEntity.status(HttpStatus.OK).body(cCustoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneCcusto(@PathVariable(value = "id") UUID id){
        Optional<CCustoModel> cCustoModelOptional= cCustoService.findById(id);

        if (!cCustoModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(cCustoModelOptional.get());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCcusto(@PathVariable(value = "id") UUID id){
        Optional<CCustoModel> cCustoModelOptional= cCustoService.findById(id);
        if (!cCustoModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found");
        }
        cCustoService.delete(cCustoModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCcusto(@PathVariable(value = "id") UUID id,@RequestBody @Valid CCustodto cCustodto){
        Optional<CCustoModel> cCustoModelOptional = cCustoService.findById(id);
        if (!cCustoModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found.");
        }
        var cCustoModel = new CCustoModel();
        BeanUtils.copyProperties(cCustodto, cCustoModel);
        cCustoModel.setId(cCustoModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(cCustoService.save(cCustoModel));
    }


}
