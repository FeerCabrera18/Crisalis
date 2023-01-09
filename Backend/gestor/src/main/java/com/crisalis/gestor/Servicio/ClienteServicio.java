package com.crisalis.gestor.Servicio;

import com.crisalis.gestor.Excepcion.personalizado.ResourceNotFoundException;
import com.crisalis.gestor.Modelo.Cliente;
import com.crisalis.gestor.Modelo.dto.ClienteDTO;
import com.crisalis.gestor.Repositorio.ClienteRepositorio;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServicio {
    private final ClienteRepositorio clienteRepositorio;
    public ClienteServicio(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }
    public Cliente guardarCliente(ClienteDTO clienteDTO) {
        return this.clienteRepositorio.save(new Cliente(clienteDTO));
    }
    public void borrarClientes (int id) {
        clienteRepositorio.deleteById(id);
    }
    public List<ClienteDTO> getlistarClientesEnBD(){
        return this.clienteRepositorio
                .findAll()
                .stream()
                .map(Cliente::toDTO)
                .collect(Collectors.toList());
    }
}