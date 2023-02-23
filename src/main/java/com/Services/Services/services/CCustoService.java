package com.Services.Services.services;


import com.Services.Services.models.CCustoModel;
import com.Services.Services.repositories.CCustoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CCustoService {

    final CCustoRepository cCustoRepository;

    public CCustoService(CCustoRepository cCustoRepository){
        this.cCustoRepository= cCustoRepository;
    }

    @Transactional
    public CCustoModel save(CCustoModel CCustoModel){
        return cCustoRepository.save(CCustoModel);
    }

    public List <CCustoModel> findAll(){
        return cCustoRepository.findAll();
    }

    @Transactional
    public void delete(CCustoModel CCustoModel){
        cCustoRepository.delete(CCustoModel);
    }

    public Optional<CCustoModel> findById(UUID id){
        return cCustoRepository.findById(id);
    }


}

//    public boolean existsByname(String name) {
//        return servicesRespository.existsByname(name);
//    }
//
//    public boolean existsBycontact(String contact) {
//        return servicesRespository.existsBycontact(contact);
//    }
//
//    public boolean existsByservice(String service) {
//        return servicesRespository.existsByservice(service);
//    }