package bja.pnud.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bja.pnud.rest.model.Recorrido;
import bja.pnud.rest.repository.RecorridoRepository;

@Service
public class RecorridoService {

    @Autowired
    private RecorridoRepository recorridoRepository;
    
    public Recorrido create(Recorrido recorrido){
        return recorridoRepository.save(recorrido);
    }

    public List<Recorrido> getAllRecorrido(){
        return recorridoRepository.findAll();
    }

    public Boolean deleteById(Long id) {
		if (recorridoRepository.existsById(id)) {
			recorridoRepository.deleteById(id);
			return true;
		}
		return false;
    }
	
    public void delete(Recorrido recorrido){
        recorridoRepository.delete(recorrido);
    }

    public Optional<Recorrido> findById(Long id){
        return recorridoRepository.findById(id);
    }
    
}
