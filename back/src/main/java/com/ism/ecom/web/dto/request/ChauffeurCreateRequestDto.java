package com.ism.ecom.web.dto.request;

import com.ism.ecom.data.entities.Chauffeur;
import com.ism.ecom.data.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class ChauffeurCreateRequestDto {
    private Long id;
    @NotBlank(message = "Le nom est obligatoire")
    private String nomComplet;

    @NotBlank(message = "Le mail est obligatoire")
    private String email;
    @NotBlank(message = "Le Telephone est obligatoire")
    @Pattern(regexp = "^[0-9]{9}", message = "Le  Telephone doit avoir au minimun 9 chiffres")
    private String telephone;
    @NotBlank(message = "Le username est obligatoire")
    private String username;
    @NotBlank(message = "Le password est obligatoire")
    private String password;

    //Mapper
    public Chauffeur toEntity(){
        Chauffeur chauffeur = Chauffeur.builder()
                .nomComplet(nomComplet)
                .telephone(telephone)
                .email(email)

                .build();
        chauffeur.setPassword(password);
        chauffeur.setUsername(username);
        return chauffeur;
    }



}
