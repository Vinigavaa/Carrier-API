package com.apiTransporte.Gereciamento.dtos;

import com.apiTransporte.Gereciamento.domain.vehicle.StatusEnum;

public record VehicleDTO(String placa, String marca, int ano, StatusEnum status ) {
}
