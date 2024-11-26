package com.apiTransporte.Gereciamento.domain.vehicle;

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
}
