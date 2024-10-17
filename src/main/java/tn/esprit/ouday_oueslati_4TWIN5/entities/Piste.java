package tn.esprit.ouday_oueslati_4TWIN5.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long numPiste;
    String namePiste;
    @Enumerated(EnumType.STRING)
    Color color;
    int length;
    int slope;
    @ManyToMany
    Set<Skier>skiers;


}
