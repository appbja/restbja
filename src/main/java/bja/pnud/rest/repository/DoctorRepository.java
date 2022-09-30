package bja.pnud.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bja.pnud.rest.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{
    
}
