package com.upeu.ms_catalogo.service;

import com.upeu.ms_catalogo.entity.Producto;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> getAllProductos();
    Optional<Producto> obtenerPorId(Integer id);
    Producto guardarProducto(Producto producto);
    void eliminarProducto(Integer id);

    // Métodos de filtrado
    List<Producto> filtrarPorCodigo(String codigo);
    List<Producto> filtrarPorFechaCreacion(Date fechaInicio, Date fechaFin);
}

