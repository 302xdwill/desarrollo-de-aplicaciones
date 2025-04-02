package com.upeu.ms_ventas.service;

import com.upeu.ms_ventas.entity.Venta;

import java.util.List;
import java.util.Optional;

public interface VentaService {
    List<Venta> listar();

    Optional<Venta> buscar(Integer id);

    Venta guardar(Venta venta);

    Venta actualizar(Integer id, Venta venta);

    void eliminar(Integer id);
}
