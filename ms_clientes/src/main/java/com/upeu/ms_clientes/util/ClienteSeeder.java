package com.upeu.ms_clientes.util;

import com.upeu.ms_clientes.entity.Cliente;
import com.upeu.ms_clientes.repository.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClienteSeeder implements CommandLineRunner {
    private final ClienteRepository clienteRepository;

    public ClienteSeeder(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void run(String... args) {
        if (clienteRepository.count() == 0) {
            List<Cliente> clientes = new ArrayList<>();
            for (int i = 1; i <= 20; i++) {
                clientes.add(new Cliente(
                        null,
                        "Nombre" + i, // Nombre del cliente
                        "Apellido" + i, // Apellido del cliente
                        "cliente" + i + "@ejemplo.com", // Email del cliente
                        "987654321" + i // Teléfono del cliente (simulado)
                ));
            }

            clienteRepository.saveAll(clientes);
            System.out.println("Datos de clientes insertados correctamente.");
        } else {
            System.out.println("Los clientes ya existen, no se insertaron datos.");
        }
    }
}
