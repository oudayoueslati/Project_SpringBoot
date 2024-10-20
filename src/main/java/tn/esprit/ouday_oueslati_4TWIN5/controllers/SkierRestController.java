package tn.esprit.ouday_oueslati_4TWIN5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Skier;
import tn.esprit.ouday_oueslati_4TWIN5.services.ISkierServices;


@RequiredArgsConstructor
@RequestMapping("skier")
@RestController
public class SkierRestController {

    private final ISkierServices skierServices;

    @PostMapping("/add")
    public Skier saveSkier(Skier skier){
        return skierServices.addSkier(skier);
    }
    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier){

        return skierServices.retrieveSkier(numSkier);
    }
}
