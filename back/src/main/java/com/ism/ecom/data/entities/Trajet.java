package com.ism.ecom.data.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
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

    @OneToMany(mappedBy ="trajet")
    private List<Itineraire> itineraires;
}
