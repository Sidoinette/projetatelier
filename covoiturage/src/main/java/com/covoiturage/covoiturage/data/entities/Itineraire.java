package com.covoiturage.covoiturage.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "itineraires")
public class Itineraire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itineraireID;

    @ManyToOne
    @JoinColumn(name = "vehiculeID")
    private Vehicule vehicule;

    @ManyToOne
    @JoinColumn(name = "trajetID")
    private Trajet trajet;


    @OneToMany(mappedBy = "itineraire")
    private List<Course> courses;



}
