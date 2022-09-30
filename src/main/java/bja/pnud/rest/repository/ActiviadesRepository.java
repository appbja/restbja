package bja.pnud.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bja.pnud.rest.model.Actividades;

public interface ActiviadesRepository extends JpaRepository<Actividades, Long> {
    
}
