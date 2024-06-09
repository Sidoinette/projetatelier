package com.ism.ecom.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "itineraires")
@Builder
public class Itineraire extends AbstractEntity {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    private double prix;

    @ManyToOne()
    private Vehicule vehicule;

    @ManyToOne()
    private Trajet trajet;

    @OneToMany(mappedBy ="itineraire" )
    private List<Course> courses = new ArrayList<Course>();
}
