package com.ism.ecom.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "courses")
@Builder
public class Course extends AbstractEntity{

    @ManyToOne()
    private Client client;

    @ManyToOne()
    private Itineraire itineraire;

}
