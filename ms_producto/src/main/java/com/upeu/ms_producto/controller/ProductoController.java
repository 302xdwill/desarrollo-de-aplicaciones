package com.upeu.ms_producto.controller;

import com.upeu.ms_producto.entity.Producto;
import com.upeu.ms_producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto findById(@PathVariable int id) {
        return productoService.findById(id);
    }

    @PostMapping
    public Producto create(@RequestBody Producto producto) {
        return productoService.Save(producto);
    }

    @PutMapping
    public Producto update(@RequestBody Producto producto) {
        return productoService.update(producto);
    }
}
