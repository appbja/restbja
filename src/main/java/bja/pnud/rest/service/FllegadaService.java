package bja.pnud.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bja.pnud.rest.model.Fllegada;
import bja.pnud.rest.repository.FllegadaRepository;

@Service
public class FllegadaService {

    @Autowired
    private FllegadaRepository fllegadaRepository;
    
    public Fllegada create(Fllegada fllegada){
        return fllegadaRepository.save(fllegada);
    }

    public List<Fllegada> getAllFllegada(){
        return fllegadaRepository.findAll();
    }

    public Boolean deleteById(Long id) {
		if (fllegadaRepository.existsById(id)) {
			fllegadaRepository.deleteById(id);
			return true;
		}
		return false;
    }
	
    public void delete(Fllegada fllegada){
        fllegadaRepository.delete(fllegada);
    }

    public Optional<Fllegada> findById(Long id){
        return fllegadaRepository.findById(id);
    }
    
}
