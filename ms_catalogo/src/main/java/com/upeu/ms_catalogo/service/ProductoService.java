package com.upeu.ms_catalogo.service;

import com.upeu.ms_catalogo.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<Producto> obtenerTodos();
    Optional<Producto> obtenerPorId(Integer id);
    Producto guardarProducto(Producto producto);
    void eliminarProducto(Integer id);
}
