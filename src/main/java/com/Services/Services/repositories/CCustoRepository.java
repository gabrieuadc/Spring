package com.Services.Services.repositories;

import com.Services.Services.models.CCustoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CCustoRepository extends JpaRepository <CCustoModel, UUID> {
}


