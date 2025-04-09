package com.upeu.ms_pagos.service.impl;

import com.upeu.ms_pagos.entity.Pago;
import com.upeu.ms_pagos.repository.PagoRepository;
import com.upeu.ms_pagos.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoServiceImpl implements PagoService {
    @Autowired
    private PagoRepository pagoRepository;

    @Override
    public List<Pago> listar() {
        return pagoRepository.findAll();
    }

    @Override
    public Optional<Pago> buscar(Integer id) {
        return pagoRepository.findById(id);
    }

    @Override
    public Pago guardar(Pago pago) {
        return pagoRepository.save(pago);
    }

    @Override
    public Pago actualizar(Integer id, Pago pago) {
        pago.setId(id);
        return pagoRepository.save(pago);
    }

    @Override
    public void eliminar(Integer id) {
        pagoRepository.deleteById(id);
    }
}
