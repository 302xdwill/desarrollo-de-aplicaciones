package com.upeu.ms_pedidos.service.impl;

import com.upeu.ms_pedidos.entity.Pedido;
import com.upeu.ms_pedidos.repository.PedidoRepository;
import com.upeu.ms_pedidos.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    @Override
    public Optional<Pedido> buscar(Integer id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public Pedido guardar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedido actualizar(Integer id, Pedido pedido) {
        pedido.setId(id);
        return pedidoRepository.save(pedido);
    }

    @Override
    public void eliminar(Integer id) {
        pedidoRepository.deleteById(id);
    }
}
