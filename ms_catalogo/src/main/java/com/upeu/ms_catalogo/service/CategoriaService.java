package com.upeu.ms_catalogo.service;

import com.upeu.ms_catalogo.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<Categoria> listar();

    Optional<Categoria> buscar(Integer id);

    Categoria guardar(Categoria categoria);

    Categoria actualizar(Integer id, Categoria categoria);

    void eliminar(Integer id);
}