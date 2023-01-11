package com.crisalis.gestor.Servicio;

import com.crisalis.gestor.Modelo.Impuestos;
import com.crisalis.gestor.Modelo.Producto;

import java.util.List;

public interface ImpuestosServicio {
    Impuestos crearImpuestos(Impuestos impuestos);
    Impuestos obtenerImpuestosById(Long id);
    List<Impuestos> obtenerLista();
    Impuestos actualizarImpuestos(Impuestos impuestos);
    void borrarImpuestos(Long id);
}
