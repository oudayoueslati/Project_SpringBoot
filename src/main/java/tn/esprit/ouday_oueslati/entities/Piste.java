package tn.esprit.ouday_oueslati.entities;

import jakarta.persistence.*;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int numPiste;
    private String namePiste;
    private Color color;
    private int length;
    private int slope;
}
