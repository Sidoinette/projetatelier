package com.covoiturage.covoiturage.data.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Role {
    Client(0),
    Admin(1),
    Chauffeur(2);
    private final long indexEnumRole;
}
