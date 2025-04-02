package com.upeu.ms_ventas.service.impl;

import com.upeu.ms_ventas.entity.Venta;
import com.upeu.ms_ventas.repository.VentaRepository;
import com.upeu.ms_ventas.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaServiceImpl implements VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> listar() {
        return ventaRepository.findAll();
    }

    @Override
    public Optional<Venta> buscar(Integer id) {
        return ventaRepository.findById(id);
    }

    @Override
    public Venta guardar(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public Venta actualizar(Integer id, Venta venta) {
        venta.setId(id);
        return ventaRepository.save(venta);
    }

    @Override
    public void eliminar(Integer id) {
        ventaRepository.deleteById(id);
    }
}
