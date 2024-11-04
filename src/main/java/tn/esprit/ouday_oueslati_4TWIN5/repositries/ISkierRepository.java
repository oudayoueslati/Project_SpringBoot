package tn.esprit.ouday_oueslati_4TWIN5.repositries;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Skier;

import java.time.LocalDate;
import java.util.List;

public interface ISkierRepository extends CrudRepository<Skier, Long> {
    List<Skier> getSkierByBirthDate(LocalDate birthDate);
    Skier findByFirstNameAndLastName(String firstName, String lastName);

    Skier findByBirthDate(LocalDate birthDate);
}

