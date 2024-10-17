package tn.esprit.ouday_oueslati_4TWIN5.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity

public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idSkier;
    String name;
    LocalDate birthDate;
    String city;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    Subscription subscription;
    @OneToMany(mappedBy = "Skier", fetch = FetchType.EAGER)
    Set<Registration> registrations;
    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;


}
