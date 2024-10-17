package tn.esprit.ouday_oueslati_4TWIN5.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numInstructor;
    String name;
    LocalDate dateOfHire;
    @OneToMany
    Set<Course> courses;
}
