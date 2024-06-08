package com.covoiturage.covoiturage.data.entities;

import com.covoiturage.covoiturage.data.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userID;
    @Column(nullable = false,length = 50)
    private String nomComplet;
    @Column(nullable = false,length = 50)
    private String Email;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    @Column(nullable = false,length = 50)
    private String password;
    @Column(nullable = false,length = 50)
    private String numero;
}
