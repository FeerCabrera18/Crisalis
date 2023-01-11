package com.crisalis.gestor.Servicio.impl;

import com.crisalis.gestor.Modelo.Impuestos;
import com.crisalis.gestor.Repositorio.ImpuestosRespositorio;
import com.crisalis.gestor.Servicio.ImpuestosServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ImpuestosServicioImpl implements ImpuestosServicio {
    private ImpuestosRespositorio  impuestosRespositorio;
    @Override
    public Impuestos crearImpuestos(Impuestos impuestos) {
        return impuestosRespositorio.save(impuestos);
    }
    @Override
    public Impuestos obtenerImpuestosById(Long id) {
        Optional<Impuestos> optionalImpuestos = impuestosRespositorio.findById(id);
        return optionalImpuestos.get();
    }
    @Override
    public List<Impuestos> obtenerLista() {
        return impuestosRespositorio.findAll();
    }
    @Override
    public Impuestos actualizarImpuestos(Impuestos impuestos) {
        Impuestos impuestosExistente = impuestosRespositorio.findById(impuestos.getId()).get();
        impuestosExistente.setIVA(impuestos.getIVA());
        impuestosExistente.setIngresos_brutos(impuestos.getIngresos_brutos());
        return impuestosRespositorio.save(impuestosExistente);
    }
    @Override
    public void borrarImpuestos(Long id) {
        impuestosRespositorio.deleteById(id);
    }
}
