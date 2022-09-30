package bja.pnud.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bja.pnud.rest.model.Actividades;
import bja.pnud.rest.repository.ActiviadesRepository;

@Service
public class ActividadesService {

    @Autowired
    private ActiviadesRepository actividadesRepository;
    
    public Actividades create(Actividades actividades){
        return actividadesRepository.save(actividades);
    }

    public List<Actividades> getAllActividadess(){
        return actividadesRepository.findAll();
    }

    public Boolean deleteById(Long id) {
		if (actividadesRepository.existsById(id)) {
			actividadesRepository.deleteById(id);
			return true;
		}
		return false;
    }
	
    public void delete(Actividades actividades){
        actividadesRepository.delete(actividades);
    }

    public Optional<Actividades> findById(Long id){
        return actividadesRepository.findById(id);
    }
    
}
