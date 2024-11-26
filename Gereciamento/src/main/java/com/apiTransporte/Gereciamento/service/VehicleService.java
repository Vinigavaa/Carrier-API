package com.apiTransporte.Gereciamento.service;

import com.apiTransporte.Gereciamento.domain.vehicle.Vehicle;
import com.apiTransporte.Gereciamento.dtos.VehicleDTO;
import com.apiTransporte.Gereciamento.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    public List<Vehicle> getAllVehicles(){
        return this.vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(UUID id) {
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado."));
    }
    public Vehicle updateVehicle(UUID id, VehicleDTO vehicleDTO) {
        Vehicle vehicle = getVehicleById(id);
        vehicle.setPlaca(vehicleDTO.placa());
        vehicle.setMarca(vehicleDTO.marca());
        vehicle.setAno(vehicleDTO.ano());
        vehicle.setStatus(vehicleDTO.status());
        return vehicleRepository.save(vehicle);
    }

    public void deleteVehicle(UUID id){
        Vehicle vehicle = getVehicleById(id);
        vehicleRepository.delete(vehicle);
    }

}
