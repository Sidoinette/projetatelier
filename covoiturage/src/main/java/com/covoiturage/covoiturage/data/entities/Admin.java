package com.covoiturage.covoiturage.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "admins")

public class Admin extends User {
    public Admin(){
        super();
    }
}
