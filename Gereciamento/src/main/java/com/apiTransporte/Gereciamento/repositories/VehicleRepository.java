package com.apiTransporte.Gereciamento.repositories;

import com.apiTransporte.Gereciamento.domain.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {
}
