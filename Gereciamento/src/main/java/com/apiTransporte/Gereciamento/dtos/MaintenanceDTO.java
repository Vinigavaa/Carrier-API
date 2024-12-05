package com.apiTransporte.Gereciamento.dtos;

import com.apiTransporte.Gereciamento.domain.vehicle.Vehicle;

import java.time.LocalDate;

public record MaintenanceDTO(Vehicle vehicle, LocalDate date, String description, double cost) {
}
