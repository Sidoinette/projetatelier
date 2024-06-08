package com.covoiturage.covoiturage.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "trajets")
public class Trajet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trajetID;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    @Column(nullable = false,length = 50)
    private String depart;
    @Column(nullable = false,length = 50)
    private String arriver;
    private Integer nbrPlaces;
    private double prix;


    @OneToMany(mappedBy = "trajet")
    private List<Itineraire> itineraires;


    @OneToMany(mappedBy = "trajet")
    private List<Client> clients;
}
