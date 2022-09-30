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

import bja.pnud.rest.model.Recorrido;
import bja.pnud.rest.service.RecorridoService;

@RestController
@RequestMapping ("/apibja/recorrido/")
public class RecorridoREST {

    @Autowired
	private RecorridoService recorridoService;
	
	@PostMapping
	private ResponseEntity<Recorrido> guardar (@RequestBody Recorrido recorrido){
		Recorrido temporal = recorridoService.create(recorrido);
		
		try {
			return ResponseEntity.created(new URI("/apibja/recorrido"+temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@GetMapping
	private ResponseEntity<List<Recorrido>> listarTodasLasRecorrido (){
		return ResponseEntity.ok(recorridoService.getAllRecorrido());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarRecorrido (@RequestBody Recorrido recorrido){
		recorridoService.delete(recorrido);
		return ResponseEntity.ok().build();
	}
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteRecorrido (@PathVariable ("id") Long id){
		return ResponseEntity.ok(recorridoService.deleteById(id));
	}

	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Recorrido>> listarRecorridosPorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(recorridoService.findById(id));
	}
    
}
