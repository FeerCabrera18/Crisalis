package com.crisalis.gestor.Servicio;

import com.crisalis.gestor.Modelo.Cliente;
import com.crisalis.gestor.Modelo.dto.ClienteDTO;
import com.crisalis.gestor.Repositorio.ClienteRepositorio;
import org.springframework.stereotype.Service;

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
    public void borrarClientes(int id) {
        this.clienteRepositorio.deleteById(id);
    }
    public ClienteDTO filtrarClientes(int id) {
        return this.clienteRepositorio.findById(id)
                .orElseThrow(
                        () ->  new RuntimeException("Usuario no encontrado")
                ).toDTO();
    }
    public List<ClienteDTO> getlistarClientesEnBD(){
        return this.clienteRepositorio
                .findAll()
                .stream()
                .map(Cliente::toDTO)
                .collect(Collectors.toList());
    }
}