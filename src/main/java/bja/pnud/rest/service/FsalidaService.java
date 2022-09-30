package bja.pnud.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bja.pnud.rest.model.Fsalida;
import bja.pnud.rest.repository.Fsalidarepository;

@Service
public class FsalidaService {

    @Autowired
    private Fsalidarepository FsalidaRepository;
    
    public Fsalida create(Fsalida fsalida){
        return FsalidaRepository.save(fsalida);
    }

    public List<Fsalida> getAllFsalidas(){
        return FsalidaRepository.findAll();
    }

    public Boolean deleteById(Long id) {
		if (FsalidaRepository.existsById(id)) {
			FsalidaRepository.deleteById(id);
			return true;
		}
		return false;
    }
	
    public void delete(Fsalida fsalida){
        FsalidaRepository.delete(fsalida);
    }

    public Optional<Fsalida> findById(Long id){
        return FsalidaRepository.findById(id);
    }
    
}

