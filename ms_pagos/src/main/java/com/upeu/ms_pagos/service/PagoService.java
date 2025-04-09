package com.upeu.ms_pagos.service;

import com.upeu.ms_pagos.entity.Pago;

import java.util.List;
import java.util.Optional;

public interface PagoService {
    List<Pago> listar();

    Optional<Pago> buscar(Integer id);

    Pago guardar(Pago venta);

    Pago actualizar(Integer id, Pago venta);

    void eliminar(Integer id);
}
