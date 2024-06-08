package com.covoiturage.covoiturage.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseID;

    private boolean etat;

    @ManyToOne
    @JoinColumn(name = "coursesID")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "itineraireID")
    private Itineraire itineraire;

}
