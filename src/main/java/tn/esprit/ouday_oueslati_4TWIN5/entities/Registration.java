package tn.esprit.ouday_oueslati_4TWIN5.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numRegistration ;
    int numWeek;
    @ManyToOne
    Skier skier;
    @ManyToOne
    Course course;
}
