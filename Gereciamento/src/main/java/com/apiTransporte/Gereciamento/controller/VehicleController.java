package com.apiTransporte.Gereciamento.controller;

import com.apiTransporte.Gereciamento.domain.vehicle.Vehicle;
import com.apiTransporte.Gereciamento.dtos.VehicleDTO;
import com.apiTransporte.Gereciamento.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public ResponseEntity<Vehicle> createVehicle(@RequestBody VehicleDTO vehicle){
        Vehicle newVehicle =vehicleService.createVehicle(vehicle);
        return new ResponseEntity<>(newVehicle, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        List<Vehicle> vehicles = this.vehicleService.getAllVehicles();
        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }

    @GetMapping("/{id}") //  /api/evento/12o13y23y-3123-rewre321
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable("id")UUID id){
        Vehicle vehicle = this.vehicleService.getVehicleById(id);
        return ResponseEntity.ok(vehicle);
    }

}
