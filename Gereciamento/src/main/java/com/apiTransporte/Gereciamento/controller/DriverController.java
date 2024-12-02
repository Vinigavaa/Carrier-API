package com.apiTransporte.Gereciamento.controller;

import com.apiTransporte.Gereciamento.domain.driver.Driver;
import com.apiTransporte.Gereciamento.dtos.DriverDTO;
import com.apiTransporte.Gereciamento.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @PostMapping
    public ResponseEntity<Driver> createDriver(@RequestBody DriverDTO driver){
        Driver newDriver = driverService.createDriver(driver);
        return new ResponseEntity<>(newDriver, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Driver>> getAllDrivers(){
        List<Driver> drivers = this.driverService.getAllDrivers();
        return new ResponseEntity<>(drivers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Driver> getDriverById(@PathVariable("id")UUID id){
        Driver driver = this.driverService.getDriverById(id);
        return ResponseEntity.ok(driver);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Driver> updateDriver(
            @PathVariable("id") UUID id, @RequestBody DriverDTO driverDTO
    ){
        Driver updateDriver = this.driverService.updateDriver(id, driverDTO);
        return ResponseEntity.ok(updateDriver);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDriver(@PathVariable("id") UUID id){
        this.driverService.deleteDriver(id);
        return ResponseEntity.noContent().build();
    }

}
