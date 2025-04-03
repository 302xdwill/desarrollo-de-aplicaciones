package com.upeu.ms_catalogo.repository;

import com.upeu.ms_catalogo.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByCodigo(String codigo);
    List<Producto> findByFechaCreacionBetween(Date inicio, Date fin);
}
