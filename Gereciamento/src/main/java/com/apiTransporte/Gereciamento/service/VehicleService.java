package com.apiTransporte.Gereciamento.service;

import com.apiTransporte.Gereciamento.domain.vehicle.Vehicle;
import com.apiTransporte.Gereciamento.dtos.VehicleDTO;
import com.apiTransporte.Gereciamento.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle createVehicle(VehicleDTO data){
        Vehicle newVehicle =new Vehicle(data);
        this.saveVehicle(newVehicle);
        return newVehicle;
    }

    public void saveVehicle(Vehicle vehicle){
        this.vehicleRepository.save(vehicle);
    }
}
