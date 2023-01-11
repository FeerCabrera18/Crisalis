package com.crisalis.gestor.Modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "servicio")
    private String servicio;
    @Column(name = "precio")
    private String precio;
    @Column(name = "servicio_especial")
    private boolean servicio_especial;
}
