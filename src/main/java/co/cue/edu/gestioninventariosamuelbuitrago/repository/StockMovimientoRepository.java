package co.cue.edu.gestioninventariosamuelbuitrago.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import co.cue.edu.gestioninventariosamuelbuitrago.model.StockMovimiento;

public interface StockMovimientoRepository extends JpaRepository<StockMovimiento, Long> {
}

