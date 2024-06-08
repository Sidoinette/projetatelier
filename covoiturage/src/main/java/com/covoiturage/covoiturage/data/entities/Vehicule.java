package com.covoiturage.covoiturage.data.entities;

import com.covoiturage.covoiturage.data.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Session;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "vehicules")
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehiculeID;
    @Column(nullable = false,length = 50)
    private String Marque;
    @Column(nullable = false,length = 50)
    private String immatriculation;
    private boolean statut;


    @OneToMany(mappedBy = "vehicule")
    private List<Itineraire> itineraires;

    @OneToOne
    @JoinColumn(name = "chauffeurID")
    private Chauffeur chauffeur;

}
