package com.covoiturage.covoiturage.data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "clients")
public class Client extends User{
    public Client(){
        super();
    }

    @OneToMany(mappedBy = "client")
    private List<Course> courses;

    @ManyToOne
    @JoinColumn(name = "trajetID")
    private Trajet trajet;


}
