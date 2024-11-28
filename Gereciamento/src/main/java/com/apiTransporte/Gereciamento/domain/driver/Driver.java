package com.apiTransporte.Gereciamento.domain.driver;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "drivers")
@Entity(name = "drivers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Driver {
    @Id
    @GeneratedValue
    UUID id;

    private String name;

    @Column(name = "cnh",length = 14)
    private String cnh;

    @Column(name = "phone",length = 14)
    private String phone;
}
