package com.apiTransporte.Gereciamento.service;

import com.apiTransporte.Gereciamento.domain.maintenance.Maintenance;
import com.apiTransporte.Gereciamento.dtos.MaintenanceDTO;
import com.apiTransporte.Gereciamento.repositories.MaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
