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

import bja.pnud.rest.model.Actividades;
import bja.pnud.rest.service.ActividadesService;

@RestController
@RequestMapping ("/apibja/actividades/")
public class ActividadesREST {

    @Autowired
	private ActividadesService actividadesService;
	
	@PostMapping
	private ResponseEntity<Actividades> guardar (@RequestBody Actividades actividades){
		Actividades temporal = actividadesService.create(actividades);
		
		try {
			return ResponseEntity.created(new URI("/apibja/actividades"+temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@GetMapping
	private ResponseEntity<List<Actividades>> listarTodasLasActividades (){
		return ResponseEntity.ok(actividadesService.getAllActividadess());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarActividades (@RequestBody Actividades actividades){
		actividadesService.delete(actividades);
		return ResponseEntity.ok().build();
	}
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteActividades (@PathVariable ("id") Long id){
		return ResponseEntity.ok(actividadesService.deleteById(id));
	}

	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Actividades>> listarActividadesPorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(actividadesService.findById(id));
	}
    
}
