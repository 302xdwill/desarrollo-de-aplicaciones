package com.upeu.ms_catalogo.controller;

import com.upeu.ms_catalogo.entity.Producto;
import com.upeu.ms_catalogo.service.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // Obtener todos los productos
    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }

    // Obtener un producto por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerPorId(@PathVariable Integer id) {
        Optional<Producto> producto = productoService.obtenerPorId(id);
        return producto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Crear un nuevo producto
    @PostMapping
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto producto) {
        Producto nuevoProducto = productoService.guardarProducto(producto);
        return ResponseEntity.ok(nuevoProducto);
    }

    // Eliminar un producto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Integer id) {
        productoService.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }

    // Filtrar productos por código
    @GetMapping("/buscar")
    public ResponseEntity<List<Producto>> obtenerPorCodigo(@RequestParam String codigo) {
        List<Producto> productos = productoService.obtenerPorCodigo(codigo);
        return productos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(productos);
    }

    // Filtrar productos por fecha de creación (rango)
    @GetMapping("/filtrar-por-fecha")
    public ResponseEntity<List<Producto>> obtenerPorFechaCreacion(
            @RequestParam("inicio") Date inicio,
            @RequestParam("fin") Date fin) {
        List<Producto> productos = productoService.obtenerPorFechaCreacion(inicio, fin);
        return productos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(productos);
    }
}
