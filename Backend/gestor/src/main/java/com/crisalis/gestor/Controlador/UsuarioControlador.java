package com.crisalis.gestor.Controlador;

import com.crisalis.gestor.Modelo.dto.UsuarioDTO;
import com.crisalis.gestor.Servicio.UsuarioServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("usuario")
public class UsuarioControlador {

    private final UsuarioServicio usuarioServicio;

    public UsuarioControlador(UsuarioServicio usuarioServicio){
        this.usuarioServicio = usuarioServicio;
    }

    @PostMapping(value = "registro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void guardarUsuario (@RequestBody UsuarioDTO usuarioDTO) {
        this.usuarioServicio.guardarUsuario(usuarioDTO);
    }
    @GetMapping(value = "iniciarSesion", produces = MediaType.APPLICATION_JSON_VALUE)
    public UsuarioDTO iniciarSesion(@RequestParam String username, String password) {
        return this.usuarioServicio.iniciarSesion(username, password);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<UsuarioDTO> borrarClientes(@PathVariable("id") int id) {
        usuarioServicio.borrarUsuario(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping(value = "listaUsuarios", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UsuarioDTO> getAllUsers() {
        return this.usuarioServicio.getListAllUsersInDB();
    }
}
