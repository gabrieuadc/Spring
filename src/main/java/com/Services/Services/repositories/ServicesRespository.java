package com.Services.Services.repositories;

import com.Services.Services.models.ServicesModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ServicesRespository extends JpaRepository <ServicesModel, UUID>{

    boolean existsByname(String name);
    boolean existsBycontact(String contact);
    boolean existsByservice(String service);

}
