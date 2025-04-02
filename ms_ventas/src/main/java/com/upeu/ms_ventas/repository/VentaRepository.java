package com.upeu.ms_ventas.repository;

import com.upeu.ms_ventas.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
}
