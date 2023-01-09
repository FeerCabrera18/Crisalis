package com.crisalis.gestor.Modelo;

import com.crisalis.gestor.Modelo.dto.ClienteDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "DNI")
    private String DNI;
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "Email")
    private String email;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Empresa")
    private boolean Empresa;
    @Column(name = "CUIT")
    private String CUIT;
    @Column(name = "razon_social")
    private String razon_social;
    @Column(name = "fecha_inicio")
    private LocalDate fecha_inicio;
    public Cliente(ClienteDTO clienteDTO){
        this.nombre = clienteDTO.getNombre();
        this.apellido = clienteDTO.getApellido();
        this.DNI = clienteDTO.getDNI();
        this.direccion = clienteDTO.getDireccion();
        this.email = clienteDTO.getEmail();
        this.telefono = clienteDTO.getTelefono();
        this.Empresa = clienteDTO.isEmpresa();
        this.CUIT = clienteDTO.getCUIT();
        this.razon_social = clienteDTO.getRazon_social();
        this.fecha_inicio = clienteDTO.getFecha_inicio();
    }
    public ClienteDTO toDTO(){
        return ClienteDTO.builder()
                .id(this.id)
                .nombre(this.nombre)
                .apellido(this.apellido)
                .DNI(this.DNI)
                .direccion(this.direccion)
                .email(this.email)
                .telefono(this.telefono)
                .Empresa(this.Empresa)
                .CUIT(this.CUIT)
                .razon_social(this.razon_social)
                .fecha_inicio(this.fecha_inicio)
                .build();
    }
}
