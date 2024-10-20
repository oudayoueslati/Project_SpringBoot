package tn.esprit.ouday_oueslati_4TWIN5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Registration;
import tn.esprit.ouday_oueslati_4TWIN5.repositries.IRegistrationRepository;
import java.util.List;

@RequiredArgsConstructor
@Service
public class RegistrationServicesImpl implements IRegistrationServices{

    private final IRegistrationRepository registrationRepository;

    public  Registration addRegistration(Registration registration){
        return registrationRepository.save(registration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return registrationRepository.findById(numRegistration).orElse(null);
    }

    @Override
    public List<Registration> retrieveAll() {
        return (List<Registration>) registrationRepository.findAll();
    }

    @Override
    public void removeRegistration(Long numRegistration) {
        registrationRepository.deleteById(numRegistration);
    }

}
