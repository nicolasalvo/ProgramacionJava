package com.example.springapi.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "planes")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double precioInicial;
    private double precioRegular;
    private int duracionSemanas;
    private double cuotaInscripcion;
    private String categoria;
    private boolean mejorValorado;

    @Column(length = 1000)
    private String beneficios;
}
