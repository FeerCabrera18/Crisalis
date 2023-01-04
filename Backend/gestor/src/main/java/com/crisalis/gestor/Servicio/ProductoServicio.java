package com.crisalis.gestor.Servicio;

import com.crisalis.gestor.Modelo.Producto;
import com.crisalis.gestor.Modelo.dto.ProductoDTO;
import com.crisalis.gestor.Repositorio.ProductoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServicio {
    private final ProductoRepositorio productoRepositorio;

    public ProductoServicio(ProductoRepositorio productoRepositorio){
        this.productoRepositorio = productoRepositorio;
    }

    public Producto crearProducto(ProductoDTO productoDTO){
        return this.productoRepositorio.save(new Producto(productoDTO));
    }
    public void borrarProducto(int id){
        this.productoRepositorio.deleteById(id);
    }

    public List<ProductoDTO> getlistarProductosEnBD(){
        return this.productoRepositorio
                .findAll()
                .stream()
                .map(Producto::toDTO)
                .collect(Collectors.toList());
    }
}
