package com.apiTransporte.Gereciamento.service;

import com.apiTransporte.Gereciamento.domain.driver.Driver;
import com.apiTransporte.Gereciamento.domain.vehicle.Vehicle;
import com.apiTransporte.Gereciamento.dtos.DriverDTO;
import com.apiTransporte.Gereciamento.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
