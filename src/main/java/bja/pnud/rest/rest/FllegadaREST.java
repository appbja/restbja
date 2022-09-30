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

import bja.pnud.rest.model.Fllegada;
import bja.pnud.rest.service.FllegadaService;

@RestController
@RequestMapping ("/apibja/fllegada/")
public class FllegadaREST {

    @Autowired
	private FllegadaService fllegadaService;
	
	@PostMapping
	private ResponseEntity<Fllegada> guardar (@RequestBody Fllegada fllegada){
		Fllegada temporal = fllegadaService.create(fllegada);
		
		try {
			return ResponseEntity.created(new URI("/apibja/fllegada"+temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@GetMapping
	private ResponseEntity<List<Fllegada>> listarTodasLasFllegada (){
		return ResponseEntity.ok(fllegadaService.getAllFllegada());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarFllegada (@RequestBody Fllegada fllegada){
		fllegadaService.delete(fllegada);
		return ResponseEntity.ok().build();
	}
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteFllegada (@PathVariable ("id") Long id){
		return ResponseEntity.ok(fllegadaService.deleteById(id));
	}

	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Fllegada>> listarFllegadasPorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(fllegadaService.findById(id));
	}
    
}
