package com.apiTransporte.Gereciamento.repositories;

import com.apiTransporte.Gereciamento.domain.driver.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DriverRepository extends JpaRepository<Driver, UUID> {
}
