package tn.esprit.ouday_oueslati_4TWIN5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Piste;
import tn.esprit.ouday_oueslati_4TWIN5.repositries.IPisteRepository;
import tn.esprit.ouday_oueslati_4TWIN5.services.IPisteServices;
import org.springframework.web.bind.annotation.*;
@Tag(name = "Gestion Piste")
@RequiredArgsConstructor
@RequestMapping("/piste")
@RestController
public class PisteRestController {
    private final IPisteServices pisteServices;
    @Getter
    private final IPisteRepository Piste;
    @Operation(description = "enregistrer Piste")
    @PostMapping("/add")
    public Piste savePiste(Piste piste){
        return pisteServices.addPiste(piste);
    }
    @Operation(description = "mise a jour Piste")
    @PutMapping("/update")
    public Piste updatePiste(@RequestBody Piste piste){
        return pisteServices.updatePiste(piste);
    }
    @Operation(description = "récupérer Piste avec numPiste")
    @GetMapping("/get/{numPiste}")
    public Piste getPiste(@PathVariable Long numPiste){
        return pisteServices.retrievePiste(numPiste);
    }
}
