package com.apiTransporte.Gereciamento.domain.vehicle;

import com.apiTransporte.Gereciamento.dtos.VehicleDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "vehicles")
@Entity(name = "vehicles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue UUID id;

    private String placa;

    private String marca;

    private int ano;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    public Vehicle(VehicleDTO data) {
        this.placa = data.placa();
        this.marca = data.marca();
        this.ano = data.ano();
        this.status = data.status();
    }
}
