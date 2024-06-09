package com.ism.ecom.data.entities;

import com.ism.ecom.security.data.entities.AppUser;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "chauffeurs")
@DiscriminatorValue(value = "chauffeur")
@Builder

public class Chauffeur extends AppUser {
    @Column(nullable = false,length = 50)
    private String nomComplet;
    @Column(nullable = false,length = 50)
    private String email;
    @Column(nullable = false,length = 20)
    private String telephone;

    @OneToOne
    private  Vehicule vehicule;
}
