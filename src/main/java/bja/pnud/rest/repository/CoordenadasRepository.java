package bja.pnud.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bja.pnud.rest.model.Coordenadas;

public interface CoordenadasRepository extends JpaRepository<Coordenadas, Long> {
    
}
