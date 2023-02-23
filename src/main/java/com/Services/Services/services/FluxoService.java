package com.Services.Services.services;

import com.Services.Services.models.FluxoModel;
import com.Services.Services.repositories.FluxoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FluxoService {

    private FluxoRepository fluxoRepository;


    public FluxoService(FluxoRepository fluxoRepository){
        this.fluxoRepository= fluxoRepository;
    }

    @Transactional
    public FluxoModel save(FluxoModel fluxoModel){
        return this.fluxoRepository.save(fluxoModel);
    }

    public List <FluxoModel> findAll(){
        return fluxoRepository.findAll();
    }

    @Transactional
    public void delete(FluxoModel fluxoModel){
        fluxoRepository.delete(fluxoModel);
    }

    public Optional<FluxoModel> findByid(UUID id){
        return fluxoRepository.findById(id);
    }

}
