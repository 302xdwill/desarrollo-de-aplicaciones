package com.upeu.ms_pagos.util;

import com.upeu.ms_pagos.entity.Pago;
import com.upeu.ms_pagos.repository.PagoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class PagoSeeder implements CommandLineRunner {
    private final PagoRepository pagoRepository;

    public PagoSeeder(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    @Override
    public void run(String... args) {
        if (pagoRepository.count() == 0) {
            List<Pago> pagos = new ArrayList<>();
            for (int i = 1; i <= 20; i++) {
                pagos.add(new Pago(
                        null,
                        "Pago" + i, // Número de pago
                        new Date(), // Fecha de pago actual
                        Math.random() * 500 + 50, // Monto aleatorio entre 50 y 550
                        "Tarjeta de Crédito" // Método de pago fijo para el ejemplo
                ));
            }

            pagoRepository.saveAll(pagos);
            System.out.println("Datos de pagos insertados correctamente.");
        } else {
            System.out.println("Los pagos ya existen, no se insertaron datos.");
        }
    }
}

