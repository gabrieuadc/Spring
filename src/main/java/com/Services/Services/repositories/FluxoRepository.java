package com.Services.Services.repositories;

import com.Services.Services.models.FluxoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FluxoRepository extends JpaRepository <FluxoModel, UUID> {
}
