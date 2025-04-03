package com.upeu.ms_catalogo.repository;

import com.upeu.ms_catalogo.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    // Puedes agregar métodos adicionales si es necesario, por ejemplo:
    // List<Producto> findByNombre(String nombre);
}
