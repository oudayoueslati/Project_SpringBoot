package tn.esprit.ouday_oueslati_4TWIN5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Registration;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Skier;
import tn.esprit.ouday_oueslati_4TWIN5.services.IRegistrationServices;
import org.springframework.web.bind.annotation.*;
@RequiredArgsConstructor
@RequestMapping("registration")
@RestController
public class RegistrationRestController {
    private final IRegistrationServices registrationServices;

    @PostMapping("/add")
    public Registration saveRegistration(Registration registration){
        return registrationServices.addRegistration(registration);
    }
    @PutMapping("/update")
    public Registration updateRegistration(@RequestBody Registration registration){
        return registrationServices.updateRegistration(registration);
    }
    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration(@PathVariable Long numRegistration){

        return registrationServices.retrieveRegistration(numRegistration);
    }
}
