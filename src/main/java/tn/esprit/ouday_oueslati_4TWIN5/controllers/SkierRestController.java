package tn.esprit.ouday_oueslati_4TWIN5.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Skier;
import tn.esprit.ouday_oueslati_4TWIN5.services.ISkierServices;

import java.time.LocalDate;

@RequiredArgsConstructor
@RequestMapping("skier")
@RestController
public class SkierRestController {

    private final ISkierServices skierServices;

    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier){
        return skierServices.addSkier(skier);
    }
    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier){
        return skierServices.updateSkier(skier);
    }
    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier){

        return skierServices.retrieveSkier(numSkier);
    }
    @PutMapping("/assignToPiste/{numSkier}/{numPiste}")
    public void assignSkier(@PathVariable Long numSkier, @PathVariable Long numPiste){
        skierServices.assignSkier(numSkier, numPiste);
    }
    @GetMapping("/getBy/{firstName}/{lastName}")
        public Skier getByFLname(@PathVariable String firstName, @PathVariable String lastName)
    {
        return skierServices.getByFirstNameAndLastName(firstName,lastName);
    }
    @GetMapping("/getByDate/{birthDate}")
    public Skier getbirthDate(@PathVariable LocalDate birthDate)
    {
        return skierServices.getBybirthDate(birthDate);
    }
}

