package tn.esprit.ouday_oueslati.entities;

import jakarta.persistence.*;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numRegistration ;
    private int numWeek;
}
