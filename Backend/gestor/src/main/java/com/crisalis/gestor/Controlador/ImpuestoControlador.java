package com.crisalis.gestor.Controlador;

import com.crisalis.gestor.Modelo.Cliente;
import com.crisalis.gestor.Modelo.Impuestos;
import com.crisalis.gestor.Servicio.ImpuestosServicio;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("impuestos")
public class ImpuestoControlador {
    private ImpuestosServicio impuestosServicio;
    @PostMapping(value = "crearImpuesto")
    public ResponseEntity<Impuestos> crearImpuestos(@RequestBody Impuestos impuestos){
        Impuestos crearImpuestos = impuestosServicio.crearImpuestos(impuestos);
        return new ResponseEntity<>(crearImpuestos, HttpStatus.CREATED);
    }
    @GetMapping(value = "obtenerImpuestoById/{id}")
    public ResponseEntity<Impuestos> obtenerImpuestosById(@PathVariable("id") Long id){
        Impuestos impuesto = impuestosServicio.obtenerImpuestosById(id);
        return new ResponseEntity<>(impuesto, HttpStatus.OK);
    }
    @GetMapping(value = "listaImpuestos")
    public ResponseEntity<List<Impuestos>> obtenerLista(){
        List<Impuestos> impuestosList = impuestosServicio.obtenerLista();
        return new ResponseEntity<>(impuestosList, HttpStatus.OK);
    }
    @PutMapping(value = "actualizarImpuestos/{id}")
    public ResponseEntity<Impuestos> actualizarImpuestos(@PathVariable("id") Long id,
                                                      @RequestBody Impuestos impuestos){
        impuestos.setId(id);
        Impuestos actualizarImpuestos = impuestosServicio.actualizarImpuestos(impuestos);
        return new ResponseEntity<>(actualizarImpuestos, HttpStatus.OK);
    }
    @DeleteMapping(value = "borrarImpuestos/{id}")
    public ResponseEntity<String> borrarImpuestos(@PathVariable("id") Long id){
        impuestosServicio.borrarImpuestos(id);
        return new ResponseEntity<>("Impuesto eliminado!", HttpStatus.OK);
    }
}
