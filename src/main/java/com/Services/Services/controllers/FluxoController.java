package com.Services.Services.controllers;


import com.Services.Services.dtos.Fluxodto;
import com.Services.Services.models.FluxoModel;
import com.Services.Services.services.FluxoService;
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
@RequestMapping("/fluxoCaixa")
public class FluxoController {

    final FluxoService fluxoService;

    public FluxoController(FluxoService fluxoService){
        this.fluxoService= fluxoService;
    }

    @PostMapping
    public ResponseEntity<Object> savefluxoCaixa(@RequestBody @Valid Fluxodto fluxodto){
        var fluxoModel = new FluxoModel();
        BeanUtils.copyProperties(fluxodto,fluxoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(fluxoService.save(fluxoModel));
    }

    @GetMapping
    public ResponseEntity<List<FluxoModel>> getAllFluxo(){
        return ResponseEntity.status(HttpStatus.OK).body(fluxoService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> getOneFluxo(@PathVariable(value = "id") UUID id){
        Optional<FluxoModel> fluxoModelOptional= fluxoService.findByid(id);

        if(!fluxoModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(fluxoService.findByid(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteFluxo(@PathVariable(value = "id")UUID id){
        Optional<FluxoModel> fluxoModelOptional= fluxoService.findByid(id);

        if(!fluxoModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found");
        }
        fluxoService.delete(fluxoModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Delete Sucessfully");
        }
}
