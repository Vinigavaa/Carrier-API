package com.apiTransporte.Gereciamento.repositories;

import com.apiTransporte.Gereciamento.domain.maintenance.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MaintenanceRepository extends JpaRepository<Maintenance, UUID> {
}
