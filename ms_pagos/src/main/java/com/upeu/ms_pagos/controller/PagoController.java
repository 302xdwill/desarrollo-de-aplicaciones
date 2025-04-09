package com.upeu.ms_pagos.controller;

import com.upeu.ms_pagos.entity.Pago;
import com.upeu.ms_pagos.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private PagoService pagoService;

    @RequestMapping
    public List<Pago> listar() {
        return pagoService.listar();
    }

    @RequestMapping("/{id}")
    public Optional<Pago> buscar(@PathVariable Integer id) {
        return pagoService.buscar(id);
    }

    @PostMapping
    public Pago guardar(@RequestBody Pago pago) {
        System.out.println(pago);
        return pagoService.guardar(pago);
    }

    @PutMapping("/{id}")
    public Pago actualizar(@PathVariable Integer id, @RequestBody Pago pago) {
        return pagoService.actualizar(id, pago);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        pagoService.eliminar(id);
    }
}
