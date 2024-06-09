package com.ism.ecom.data.entities;

import com.ism.ecom.security.data.entities.AppRole;
import com.ism.ecom.security.data.entities.AppUser;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "clients")
@DiscriminatorValue(value = "client")
@Builder
public class Client extends AppUser {
    @Column(nullable = false,length = 50)
    private String nomComplet;
    @Column(nullable = false,length = 50)
    private String email;
    @Column(nullable = false,length = 20)
    private String telephone;

    @OneToMany(mappedBy ="client" )
    private List<Course> courses = new ArrayList<Course>();

}
