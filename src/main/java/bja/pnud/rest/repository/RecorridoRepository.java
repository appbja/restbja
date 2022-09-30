package bja.pnud.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bja.pnud.rest.model.Recorrido;

public interface RecorridoRepository extends JpaRepository<Recorrido, Long> {
    
}
