package com.upeu.ms_pedidos.util;

import com.upeu.ms_pedidos.entity.Pedido;
import com.upeu.ms_pedidos.repository.PedidoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class PedidoSeeder implements CommandLineRunner {

    private final PedidoRepository pedidoRepository;

    public PedidoSeeder(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public void run(String... args) {
        if (pedidoRepository.count() == 0) {
            List<Pedido> pedidos = new ArrayList<>();
            String[] estados = {"PENDIENTE", "EN PROCESO", "ENTREGADO", "CANCELADO"};

            for (int i = 1; i <= 20; i++) {
                pedidos.add(new Pedido(
                        null,
                        "PED-" + String.format("%04d", i),
                        new Date(),
                        Math.random() * 1000 + 100,
                        estados[i % estados.length]
                ));
            }

            pedidoRepository.saveAll(pedidos);
            System.out.println("Datos de pedidos insertados correctamente.");
        } else {
            System.out.println("Los pedidos ya existen, no se insertaron datos.");
        }
    }
}
