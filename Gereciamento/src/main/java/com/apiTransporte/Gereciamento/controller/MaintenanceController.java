package com.apiTransporte.Gereciamento.controller;

import com.apiTransporte.Gereciamento.domain.maintenance.Maintenance;
import com.apiTransporte.Gereciamento.dtos.MaintenanceDTO;
import com.apiTransporte.Gereciamento.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {
    @Autowired
    private MaintenanceService maintenanceService;

    @PostMapping
    public ResponseEntity<Maintenance> createMaintenance(@RequestBody MaintenanceDTO maintenance){
        Maintenance newMaintenance = maintenanceService.createMaintenance(maintenance);
        return new ResponseEntity<>(newMaintenance, HttpStatus.CREATED);
    }

}