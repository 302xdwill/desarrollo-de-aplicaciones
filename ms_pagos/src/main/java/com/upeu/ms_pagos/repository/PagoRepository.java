package com.upeu.ms_pagos.repository;

import com.upeu.ms_pagos.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRepository extends JpaRepository<Pago, Integer> {
}
