package tn.esprit.ouday_oueslati.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity

public class skier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSkier;
    private String name;
    private LocalDate birthDate;
}
