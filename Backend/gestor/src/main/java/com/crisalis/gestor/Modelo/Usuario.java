package com.crisalis.gestor.Modelo;

import com.crisalis.gestor.Modelo.dto.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;
    @Column(name = "Usuario")
    private String username;
    @Column(name = "Contraseña")
    private String password;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;

    public Usuario(UsuarioDTO usuarioDTO){
        this.nombre = usuarioDTO.getNombre();
        this.apellido = usuarioDTO.getApellido();
        this.username = usuarioDTO.getUsername();
        this.password = usuarioDTO.getPassword();
    }
    public UsuarioDTO toDTO() {
        return
                UsuarioDTO.builder()
                        .id(this.Id)
                        .nombre(this.nombre)
                        .apellido(this.apellido)
                        .username(this.username)
                        .password(this.password)
                        .build();
    }
}
