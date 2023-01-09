package com.crisalis.gestor.Controlador;

import com.crisalis.gestor.Modelo.Producto;
import com.crisalis.gestor.Modelo.dto.ClienteDTO;
import com.crisalis.gestor.Modelo.dto.ProductoDTO;
import com.crisalis.gestor.Servicio.ProductoServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Bienes")
public class ProductoControlador {
    private final ProductoServicio productoServicio;
    public ProductoControlador(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }
    @PostMapping(value = "crearProducto", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Producto crearProducto(@RequestBody ProductoDTO productoDTO){
        return this.productoServicio.crearProducto(productoDTO);
    }
    @DeleteMapping("borrarProducto/{id}")
    public ResponseEntity<ProductoDTO> borrarProducto(@PathVariable("id") int id) {
        productoServicio.borrarProducto(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping(value = "listarProductos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductoDTO> listarProductos(){
        return this.productoServicio.getlistarProductosEnBD();
    }
}

