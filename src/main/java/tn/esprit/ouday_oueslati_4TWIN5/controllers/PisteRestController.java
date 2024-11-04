package tn.esprit.ouday_oueslati_4TWIN5.controllers;

import lombok.RequiredArgsConstructor;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Course;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Piste;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Skier;
import tn.esprit.ouday_oueslati_4TWIN5.services.IPisteServices;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("piste")
@RestController
public class PisteRestController {
    private final IPisteServices pisteServices;

    @PostMapping("/add")
    public Piste savePiste(Piste piste){
        return pisteServices.addPiste(piste);
    }
    @PutMapping("/update")
    public Piste updatePiste(@RequestBody Piste piste){
        return pisteServices.updatePiste(piste);
    }
    @GetMapping("/get/{numPiste}")
    public Piste getPiste(@PathVariable Long numPiste){

        return pisteServices.retrievePiste(numPiste);
    }
}

