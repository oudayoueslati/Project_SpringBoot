package tn.esprit.ouday_oueslati_4TWIN5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Piste;
import tn.esprit.ouday_oueslati_4TWIN5.repositries.IPisteRepository;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PisteServicesImpl implements  IPisteServices{

    private final IPisteRepository pisteRepository ;

    public Piste addPiste(Piste piste){
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public List<Piste> retrieveAll() {
        return (List<Piste>) pisteRepository.findAll();
    }

    public void removePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }
}
