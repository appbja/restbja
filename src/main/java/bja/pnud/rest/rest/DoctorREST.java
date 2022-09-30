package bja.pnud.rest.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bja.pnud.rest.model.Doctor;
import bja.pnud.rest.service.DoctorService;

@RestController
@RequestMapping ("/apibja/doctor/")
public class DoctorREST {

    @Autowired
	private DoctorService doctorService;
	
	@PostMapping
	private ResponseEntity<Doctor> guardar (@RequestBody Doctor doctor){
		Doctor temporal = doctorService.create(doctor);
		
		try {
			return ResponseEntity.created(new URI("/apibja/doctor"+temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@GetMapping
	private ResponseEntity<List<Doctor>> listarTodasLasDoctor (){
		return ResponseEntity.ok(doctorService.getAllDoctors());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarDoctor (@RequestBody Doctor doctor){
		doctorService.delete(doctor);
		return ResponseEntity.ok().build();
	}
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteDoctor (@PathVariable ("id") Long id){
		return ResponseEntity.ok(doctorService.deleteById(id));
	}

	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Doctor>> listarDoctorPorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(doctorService.findById(id));
	}
    
}
