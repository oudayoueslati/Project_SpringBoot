package tn.esprit.ouday_oueslati_4TWIN5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ouday_oueslati_4TWIN5.entities.*;
import tn.esprit.ouday_oueslati_4TWIN5.repositries.*;
import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SkierServicesImpl implements ISkierServices{

    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
    private final ISubscriptionRepository subscriptionRepository;
    private final IRegistrationRepository registrationRepository;
    private final ICourseRepository courseRepository;


    public Skier addSkier (Skier skier){
        Subscription subscription = skier.getSubscription();
        subscriptionRepository.save(subscription);
        skier.setSubscription(subscription);
        return skierRepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public List<Skier> retrieveAll() {
        return (List<Skier>) skierRepository.findAll();
    }

    @Override
    public void removeSkier(Long numSkier) {
        skierRepository.deleteById(numSkier);
    }

    @Override
    public void assignSkier(Long numSkier, Long numPiste) {
        Skier skier = skierRepository.findById(numSkier).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        assert piste != null;
        piste.getSkiers().add(skier);
        pisteRepository.save(piste);
    }
    @Override
    public Skier getByFirstNameAndLastName(String firstName, String lastName) {
        return skierRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public Skier getBybirthDate(LocalDate birthDate) {
        return skierRepository.findByBirthDate(birthDate);
    }
    @Override
     public Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier){
        Skier skier = skierRepository.findById(numSkier).orElse(null);
        registration.setSkier(skier);
        return registrationRepository.save(registration);
    }
    @Override
    public Skier addSkierAndAssignToCourse(Skier skier , Long numCourse){

        Registration registration = registrationRepository.findById(numCourse).orElse(null);
        Course course = courseRepository.findById(numCourse).orElse(null);
        registration.setSkier(skier);
        return skierRepository.save(skier);
    }
    @Override
    public List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeSubscription) {
        return skierRepository.findBySubscription_TypeSub(typeSubscription);
    }
}
