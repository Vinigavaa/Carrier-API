package com.apiTransporte.Gereciamento.service;

import com.apiTransporte.Gereciamento.domain.driver.Driver;
import com.apiTransporte.Gereciamento.domain.vehicle.Vehicle;
import com.apiTransporte.Gereciamento.dtos.DriverDTO;
import com.apiTransporte.Gereciamento.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DriverService {
    @Autowired
    private DriverRepository driverRepository;
    public Driver createDriver(DriverDTO data) {
        Driver newDriver = new Driver(data);
        this.saveDriver(newDriver);
        return newDriver;
    }

    public void saveDriver(Driver driver){
        this.driverRepository.save(driver);
    }

    public List<Driver> getAllDrivers() {
        return this.driverRepository.findAll();
    }

    public Driver getDriverById(UUID id) {
        return driverRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("Motorista não encontrado."));
    }

    public Driver updateDriver(UUID id, DriverDTO driverDTO) {
        Driver driver = getDriverById(id);
        driver.setName(driverDTO.name());
        driver.setCnh(driverDTO.cnh());
        driver.setPhone(driverDTO.phone());
        return driverRepository.save(driver);
    }

    public void deleteDriver(UUID id) {
        driverRepository.deleteById(id);
    }
}
