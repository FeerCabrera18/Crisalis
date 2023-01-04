package com.crisalis.gestor.Modelo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ClienteDTO {
    @JsonProperty("Nombre")
    private String nombre;
    @JsonProperty("Apellido")
    private String apellido;
    @JsonProperty("DNI")
    private String DNI;
    @JsonProperty("Direccion")
    private String direccion;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("Telefono")
    private String telefono;
    @JsonProperty("Empresa")
    private boolean Empresa;
    @JsonProperty("CUIT")
    private String CUIT;
    @JsonProperty("razon_social")
    private String razon_social;
    @JsonProperty("fecha_inicio")
    private LocalDate fecha_inicio;
}
