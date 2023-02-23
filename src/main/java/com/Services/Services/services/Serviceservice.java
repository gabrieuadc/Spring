package com.Services.Services.services;


import com.Services.Services.models.ServicesModel;
import com.Services.Services.repositories.ServicesRespository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class Serviceservice {

    final ServicesRespository servicesRespository;

    public Serviceservice(ServicesRespository servicesRespository){
        this.servicesRespository = servicesRespository;
    }

    @Transactional
    public ServicesModel save(ServicesModel servicesModel) {
        return servicesRespository.save(servicesModel);
    }

    public List<ServicesModel> findAll() {
        return servicesRespository.findAll();
    }

    @Transactional
    public void delete(ServicesModel parkingSpotModel) {
        servicesRespository.delete(parkingSpotModel);
    }

    public Optional<ServicesModel> findById(UUID id) {
        return servicesRespository.findById(id);
    }

    public boolean existsByname(String name) {
        return servicesRespository.existsByname(name);
    }

    public boolean existsBycontact(String contact) {
        return servicesRespository.existsBycontact(contact);
    }

    public boolean existsByservice(String service) {
        return servicesRespository.existsByservice(service);
    }


}

