package com.apiTransporte.Gereciamento.controller;

import com.apiTransporte.Gereciamento.domain.maintenance.Maintenance;
import com.apiTransporte.Gereciamento.domain.vehicle.Vehicle;
import com.apiTransporte.Gereciamento.dtos.MaintenanceDTO;
import com.apiTransporte.Gereciamento.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping
    public ResponseEntity<List<Maintenance>> getAllMaintenances(){
        List<Maintenance> maintenances = this.maintenanceService.getAllMaintenances();
        return new ResponseEntity<>(maintenances, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Maintenance> getMaintenanceById(@PathVariable("id") UUID id){
        Maintenance maintenance = this.maintenanceService.getMaintenanceById(id);
        return ResponseEntity.ok(maintenance);
    }

}
