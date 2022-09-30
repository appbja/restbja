package bja.pnud.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bja.pnud.rest.model.Doctor;
import bja.pnud.rest.repository.DoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;
    
    public Doctor create(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public Boolean deleteById(Long id) {
		if (doctorRepository.existsById(id)) {
			doctorRepository.deleteById(id);
			return true;
		}
		return false;
    }
	
    public void delete(Doctor doctor){
        doctorRepository.delete(doctor);
    }

    public Optional<Doctor> findById(Long id){
        return doctorRepository.findById(id);
    }
    
}
