package com.upeu.ms_catalogo.repository;

import com.upeu.ms_catalogo.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    // Buscar productos por código
    List<Producto> findByCodigo(String codigo);

    // Buscar productos por fecha de creación
    @Query("SELECT p FROM Producto p WHERE p.fechaCreacion BETWEEN :startDate AND :endDate")
    List<Producto> findByFechaCreacionBetween(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}

