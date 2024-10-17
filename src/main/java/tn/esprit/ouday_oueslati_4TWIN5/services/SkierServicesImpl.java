package tn.esprit.ouday_oueslati_4TWIN5.services;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Skier;
import tn.esprit.ouday_oueslati_4TWIN5.repositries.ISkierRepository;

public class SkierServicesImpl {

    private ISkierRepository skierRepository;

    public Skier addSkier (Skier skier){
        return skierRepository.save(skier);
    }
}
