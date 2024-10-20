package tn.esprit.ouday_oueslati_4TWIN5.services;

import tn.esprit.ouday_oueslati_4TWIN5.entities.Registration;
import java.util.List;

public interface IRegistrationServices {

    Registration addRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    Registration retrieveRegistration(Long numRegistration);
    List<Registration> retrieveAll();
    void removeRegistration(Long numRegistration);
}
