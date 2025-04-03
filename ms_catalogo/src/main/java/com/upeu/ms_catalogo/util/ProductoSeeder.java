package com.upeu.ms_catalogo.util;

import com.upeu.ms_catalogo.entity.Producto;
import com.upeu.ms_catalogo.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ProductoSeeder implements CommandLineRunner {

    private final ProductoRepository productoRepository;

    public ProductoSeeder(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public void run(String... args) {
        // Verificamos si ya existen productos
        if (productoRepository.count() == 0) {
            Producto p1 = new Producto("P001", "Producto 1", "Descripción del Producto 1", 99.99, new Date());
            Producto p2 = new Producto("P002", "Producto 2", "Descripción del Producto 2", 199.99, new Date());
            Producto p3 = new Producto("P003", "Producto 3", "Descripción del Producto 3", 49.99, new Date());

            productoRepository.save(p1);
            productoRepository.save(p2);
            productoRepository.save(p3);

            System.out.println("Productos insertados correctamente.");
        } else {
            System.out.println("Los productos ya existen.");
        }
    }
}