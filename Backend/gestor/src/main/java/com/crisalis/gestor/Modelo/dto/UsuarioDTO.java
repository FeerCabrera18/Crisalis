package com.crisalis.gestor.Modelo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import javax.persistence.Column;

@Data
@Builder
public class UsuarioDTO {
    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("Nombre")
    private String nombre;
    @JsonProperty("Apellido")
    private String apellido;
    @JsonProperty("Usuario")
    private String username;
    @JsonProperty("Contraseña")
    private String password;


}
