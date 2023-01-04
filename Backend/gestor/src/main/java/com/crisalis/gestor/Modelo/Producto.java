package com.crisalis.gestor.Modelo;

import com.crisalis.gestor.Modelo.dto.ProductoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Bienes")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "producto")
    private String producto;
    @Column(name = "precio")
    private String precio;
    @Column(name = "stock")
    private Integer stock;

    public Producto(ProductoDTO productoDTO){
        this.producto = productoDTO.getProducto();
        this.precio = productoDTO.getPrecio();
        this.stock = productoDTO.getStock();
    }
    public ProductoDTO toDTO(){
        return ProductoDTO.builder()
                .producto(this.producto)
                .precio(this.precio)
                .stock(this.stock)
                .build();
    }
}
