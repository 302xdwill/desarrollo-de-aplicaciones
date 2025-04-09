package com.upeu.ms_pagos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroPago;
    private Date fechaPago;
    private Double montoPago;
    private String metodoPago;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(String numeroPago) {
        this.numeroPago = numeroPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(Double montoPago) {
        this.montoPago = montoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Pago(Integer id, String numeroPago, Date fechaPago, Double montoPago, String metodoPago) {
        this.id = id;
        this.numeroPago = numeroPago;
        this.fechaPago = fechaPago;
        this.montoPago = montoPago;
        this.metodoPago = metodoPago;
    }

    public Pago() {
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", numeroPago='" + numeroPago + '\'' +
                ", fechaPago=" + fechaPago +
                ", montoPago=" + montoPago +
                ", metodoPago='" + metodoPago + '\'' +
                '}';
    }
}
