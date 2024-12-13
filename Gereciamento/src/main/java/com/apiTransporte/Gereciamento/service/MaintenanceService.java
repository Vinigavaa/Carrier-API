package com.apiTransporte.Gereciamento.service;

import com.apiTransporte.Gereciamento.domain.maintenance.Maintenance;
import com.apiTransporte.Gereciamento.dtos.MaintenanceDTO;
import com.apiTransporte.Gereciamento.repositories.MaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MaintenanceService {

    @Autowired
    private MaintenanceRepository maintenanceRepository;

    public void saveMaintenance(Maintenance maintenance){
        this.maintenanceRepository.save(maintenance);
    }
    public Maintenance createMaintenance(MaintenanceDTO data) {
        Maintenance newMaintenance = new Maintenance(data);
        this.saveMaintenance(newMaintenance);
        return newMaintenance;
    }

    public List<Maintenance> getAllMaintenances(){
        return this.maintenanceRepository.findAll();
    }

    public Maintenance getMaintenanceById (UUID id) {
        return maintenanceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Manutenção não encontrada."));
    }

    public Maintenance updateMaintenance(UUID id, MaintenanceDTO maintenanceDTO) {
        Maintenance maintenance = getMaintenanceById(id);
        maintenance.setVehicle(maintenanceDTO.vehicle());
        maintenance.setDescription(maintenanceDTO.description());
        maintenance.setCost(maintenanceDTO.cost());
        maintenance.setDate(maintenanceDTO.date());
        return maintenanceRepository.save(maintenance);
    }
}
