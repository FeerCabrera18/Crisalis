package com.crisalis.gestor.Controlador;

import com.crisalis.gestor.Modelo.Cliente;
import com.crisalis.gestor.Modelo.dto.ClienteDTO;
import com.crisalis.gestor.Servicio.ClienteServicio;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteControlador {
    private final ClienteServicio clienteServicio;
    public ClienteControlador(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
    }
    @PostMapping(value = "guardarClientes", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cliente guardarCliente(@RequestBody ClienteDTO clienteDTO) {
        return this.clienteServicio.guardarCliente(clienteDTO);
    }
    @GetMapping(value = "filtrarClientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ClienteDTO filtrarClientes(@RequestParam int id) {
        return this.clienteServicio.filtrarClientes(id);
    }
    @PostMapping(value = "borrarClientes")
    public void borrarClientes(@RequestParam int id){
        this.clienteServicio.borrarClientes(id);
    }
    @GetMapping(value = "listarClientes",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClienteDTO> listarClientes() {
        return  this.clienteServicio.getlistarClientesEnBD();
    }
}