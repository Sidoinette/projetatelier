package com.ism.ecom.data.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "trajets")
@Builder
public class Trajet extends AbstractEntity{
    @Column(nullable = false,length = 50)
    private String depart;
    @Column(nullable = false,length = 50)
    private String arriver;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private int placeTotal;
    private int placeDispo;
    private double prix;

    @OneToMany(mappedBy ="trajet")
    @Column(nullable = true)
    private List<Itineraire> itineraires;
}
