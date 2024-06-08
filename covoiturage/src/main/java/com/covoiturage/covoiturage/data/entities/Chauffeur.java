package com.covoiturage.covoiturage.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity

@Getter
@Setter
@Table(name = "chauffeurs")
public class Chauffeur extends User{
    public Chauffeur(){
        super();
    }

    @OneToOne(mappedBy = "chauffeur")
    private Vehicule vehicule;
}
