package tn.esprit.ouday_oueslati_4TWIN5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Course;
import tn.esprit.ouday_oueslati_4TWIN5.services.ICourseServices;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("course")
@RestController
public class CourseRestController {
    private final ICourseServices courseServices;

    @PostMapping("/add")
    public Course saveCourse(Course course){
        return courseServices.addCourse(course);
    }
    @GetMapping("/get/{numCourse}")
    public Course getCourse(@PathVariable Long numCourse){

        return courseServices.retrieveCourse(numCourse);
    }

}
