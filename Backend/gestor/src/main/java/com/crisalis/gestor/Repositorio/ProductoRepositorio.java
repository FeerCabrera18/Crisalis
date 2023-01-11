package com.crisalis.gestor.Repositorio;

import com.crisalis.gestor.Modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
}
