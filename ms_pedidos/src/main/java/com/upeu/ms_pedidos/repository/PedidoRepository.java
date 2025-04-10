package com.upeu.ms_pedidos.repository;

import com.upeu.ms_pedidos.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
