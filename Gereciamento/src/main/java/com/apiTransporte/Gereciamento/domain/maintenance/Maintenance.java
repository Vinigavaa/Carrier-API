package com.apiTransporte.Gereciamento.domain.maintenance;

import com.apiTransporte.Gereciamento.domain.vehicle.Vehicle;
import com.apiTransporte.Gereciamento.dtos.MaintenanceDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Table(name="maintenances")
@Entity(name="maintenances")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {
    @Id
    @GeneratedValue
    UUID id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    private LocalDate date;

    private String description;

    private double cost;

    public Maintenance(MaintenanceDTO data){
        this.vehicle = data.vehicle();
        this.date = data.date();
        this.description = data.description();
        this.cost = data.cost();
    }
}

