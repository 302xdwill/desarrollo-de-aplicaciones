package com.upeu.ms_producto.repository;

import com.upeu.ms_producto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
