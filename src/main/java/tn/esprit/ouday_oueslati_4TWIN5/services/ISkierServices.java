package tn.esprit.ouday_oueslati_4TWIN5.services;

import tn.esprit.ouday_oueslati_4TWIN5.entities.Skier;

import java.time.LocalDate;
import java.util.List;

public interface ISkierServices {

    Skier addSkier (Skier skier);
    Skier updateSkier (Skier skier);
    Skier retrieveSkier (Long numSkier);
    List<Skier> retrieveAll();
    void removeSkier(Long numSkier);
    void assignSkier(Long numSkier, Long numPiste);
    Skier getByFirstNameAndLastName(String firstName, String lastName);
    Skier getBybirthDate(LocalDate birthDate);
}
