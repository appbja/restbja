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

import bja.pnud.rest.model.Coordenadas;
import bja.pnud.rest.service.CoordenadasService;

@RestController
@RequestMapping ("/apibja/coordenadas/")
public class CoordenadasREST {

    @Autowired
	private CoordenadasService coordenadasService;
	
	@PostMapping
	private ResponseEntity<Coordenadas> guardar (@RequestBody Coordenadas coordenadas){
		Coordenadas temporal = coordenadasService.create(coordenadas);
		
		try {
			return ResponseEntity.created(new URI("/apibja/coordenadas"+temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@GetMapping
	private ResponseEntity<List<Coordenadas>> listarTodasLasCoordenadas (){
		return ResponseEntity.ok(coordenadasService.getAllCoordenadass());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarCoordenadas (@RequestBody Coordenadas coordenadas){
		coordenadasService.delete(coordenadas);
		return ResponseEntity.ok().build();
	}
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteCoordenadas (@PathVariable ("id") Long id){
		return ResponseEntity.ok(coordenadasService.deleteById(id));
	}

	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Coordenadas>> listarCoordenadasPorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(coordenadasService.findById(id));
	}
    
}
