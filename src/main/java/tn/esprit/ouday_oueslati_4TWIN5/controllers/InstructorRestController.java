package tn.esprit.ouday_oueslati_4TWIN5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Instructor;
import tn.esprit.ouday_oueslati_4TWIN5.services.IInstructorServices;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("instructor")
@RestController
public class InstructorRestController {

    private final IInstructorServices instructorServices;

    @PostMapping("/add")
    public Instructor saveInstructor(Instructor instructor){
        return instructorServices.addInstructor(instructor);
    }
    @GetMapping("/get/{numInstructor}")
    public Instructor getPInstructor(@PathVariable Long numInstructor){

        return instructorServices.retrieveInstructor(numInstructor);
    }

}
