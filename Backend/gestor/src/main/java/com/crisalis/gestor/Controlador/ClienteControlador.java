package com.crisalis.gestor.Controlador;

import com.crisalis.gestor.Excepcion.personalizado.ResourceNotFoundException;
import com.crisalis.gestor.Modelo.Cliente;
import com.crisalis.gestor.Modelo.dto.ClienteDTO;
import com.crisalis.gestor.Repositorio.ClienteRepositorio;
import com.crisalis.gestor.Servicio.ClienteServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteControlador {
    private final ClienteServicio clienteServicio;
    public ClienteControlador(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
    }
    @PostMapping(value = "guardarClientes", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cliente guardarClientes(@RequestBody ClienteDTO clienteDTO) {
        return this.clienteServicio.guardarCliente(clienteDTO);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<ClienteDTO> borrarClientes(@PathVariable("id") int id) {
        clienteServicio.borrarClientes(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    //@PutMapping("{id}")
    //public ResponseEntity<ClienteDTO> actualizarCliente (@PathVariable int id, @RequestBody ClienteDTO clienteDTO) {
    //    this.clienteServicio.actualizarCliente(int id);
    @GetMapping(value = "listarClientes",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClienteDTO> listarClientes() {
        return  this.clienteServicio.getlistarClientesEnBD();
    }
}