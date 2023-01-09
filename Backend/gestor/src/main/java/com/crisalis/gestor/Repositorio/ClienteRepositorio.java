package com.crisalis.gestor.Repositorio;

import com.crisalis.gestor.Modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
    Optional<Cliente> findById(Integer integer);
    void deleteById(int id);
}