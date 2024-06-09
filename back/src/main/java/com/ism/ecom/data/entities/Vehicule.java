package com.ism.ecom.data.entities;

import com.ism.ecom.security.data.entities.AppUser;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "vehicules")
@Builder
public class Vehicule extends AbstractEntity {
    @Column(nullable = false,length = 50)
    private String marque;
    @Column(nullable = false,length = 50)
    private String status;
    private Integer nbrPlaces;

    @OneToMany(mappedBy ="vehicule")
    private List<Itineraire> itineraires;

    @OneToOne
    private  Chauffeur chauffeur;
}
