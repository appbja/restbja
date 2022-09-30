package bja.pnud.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bja.pnud.rest.model.Coordenadas;
import bja.pnud.rest.repository.CoordenadasRepository;

@Service
public class CoordenadasService {

    @Autowired
    private CoordenadasRepository coordenadasRepository;
    
    public Coordenadas create(Coordenadas coordenadas){
        return coordenadasRepository.save(coordenadas);
    }

    public List<Coordenadas> getAllCoordenadass(){
        return coordenadasRepository.findAll();
    }

    public Boolean deleteById(Long id) {
		if (coordenadasRepository.existsById(id)) {
			coordenadasRepository.deleteById(id);
			return true;
		}
		return false;
    }
	
    public void delete(Coordenadas coordenadas){
        coordenadasRepository.delete(coordenadas);
    }

    public Optional<Coordenadas> findById(Long id){
        return coordenadasRepository.findById(id);
    }
    
}
