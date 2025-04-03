package com.upeu.ms_catalogo.util;

import com.upeu.ms_catalogo.entity.Producto;
import com.upeu.ms_catalogo.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductoSeeder implements CommandLineRunner {

    private final ProductoRepository productoRepository;

    public ProductoSeeder(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public void run(String... args) {
        // Verificamos si ya existen datos para no duplicar
        if (productoRepository.count() == 0) {
            Producto prod1 = new Producto(null, "P001", "Producto A", "Descripción del Producto A", 100.0, new java.util.Date());
            Producto prod2 = new Producto(null, "P002", "Producto B", "Descripción del Producto B", 150.0, new java.util.Date());
            Producto prod3 = new Producto(null, "P003", "Producto C", "Descripción del Producto C", 200.0, new java.util.Date());
            Producto prod4 = new Producto(null, "P004", "Producto D", "Descripción del Producto D", 250.0, new java.util.Date());
            Producto prod5 = new Producto(null, "P005", "Producto E", "Descripción del Producto E", 300.0, new java.util.Date());

            productoRepository.save(prod1);
            productoRepository.save(prod2);
            productoRepository.save(prod3);
            productoRepository.save(prod4);
            productoRepository.save(prod5);

            System.out.println("Datos de productos insertados correctamente.");
        } else {
            System.out.println("Los productos ya existen, no se insertaron datos.");
        }
    }
}
