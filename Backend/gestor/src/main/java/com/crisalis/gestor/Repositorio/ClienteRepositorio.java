package com.crisalis.gestor.Repositorio;

import com.crisalis.gestor.Modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}
