package com.upeu.ms_ventas.util;

import com.upeu.ms_ventas.entity.Venta;
import com.upeu.ms_ventas.repository.VentaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class VentaSeeder implements CommandLineRunner {
    private final VentaRepository ventaRepository;

    public VentaSeeder(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    @Override
    public void run(String... args) {
        if (ventaRepository.count() == 0) {
            List<Venta> ventas = new ArrayList<>();
            for (int i = 1; i <= 20; i++) {
                ventas.add(new Venta(null, "Venta " + i, "Descripción de venta " + i, new Date(), Math.random() * 500 + 50));
            }

            ventaRepository.saveAll(ventas);
            System.out.println("Datos de ventas insertados correctamente.");
        } else {
            System.out.println("Las ventas ya existen, no se insertaron datos.");
        }
    }
}
