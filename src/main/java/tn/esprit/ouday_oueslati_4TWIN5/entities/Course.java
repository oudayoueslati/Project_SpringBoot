package tn.esprit.ouday_oueslati_4TWIN5.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numCourse;
    int level ;
    @Enumerated(EnumType.STRING)
    TypeCourse typeCourse ;
    @Enumerated(EnumType.STRING)
    Support support;
    float price;
    int timeSlot;
    @OneToMany(mappedBy = "course")
    Set<Registration> registrations;
}
