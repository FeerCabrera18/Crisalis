package com.crisalis.gestor.Repositorio;

import com.crisalis.gestor.Modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
    //@Query("select c from Cliente c where c.identificacion = ?1")
    Optional<Cliente> findById (Integer id);
}