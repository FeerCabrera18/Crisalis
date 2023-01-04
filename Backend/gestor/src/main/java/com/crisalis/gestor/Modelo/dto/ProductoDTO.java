package com.crisalis.gestor.Modelo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class ProductoDTO {
    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("producto")
    private String producto;
    @JsonProperty("precio")
    private String precio;
    @JsonProperty("stock")
    private Integer stock;
    
}
