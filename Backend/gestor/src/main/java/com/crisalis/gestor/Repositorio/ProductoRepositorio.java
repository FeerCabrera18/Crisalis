package com.crisalis.gestor.Repositorio;

import com.crisalis.gestor.Modelo.Producto;
import com.crisalis.gestor.Modelo.dto.ProductoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
    Optional<Producto> findById (Integer integer);
    void deleteById(int id);
}
