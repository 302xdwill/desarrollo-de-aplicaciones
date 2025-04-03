package com.upeu.ms_catalogo.service.impl;

import com.upeu.ms_catalogo.entity.Producto;
import com.upeu.ms_catalogo.repository.ProductoRepository;
import com.upeu.ms_catalogo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> obtenerPorId(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Integer id) {
        productoRepository.deleteById(id);
    }

    // Implementación de los métodos de filtro
    @Override
    public List<Producto> obtenerPorCodigo(String codigo) {
        return productoRepository.findByCodigo(codigo);
    }

    @Override
    public List<Producto> obtenerPorFechaCreacion(Date inicio, Date fin) {
        return productoRepository.findByFechaCreacionBetween(inicio, fin);
    }
}
