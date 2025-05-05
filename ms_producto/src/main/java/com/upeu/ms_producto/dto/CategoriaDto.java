package com.upeu.ms_producto.dto;

import lombok.Data;

@Data
public class CategoriaDto {
    private String nombre;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaDto(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    public CategoriaDto() {
    }

    @Override
    public String toString() {
        return "CategoriaDto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
