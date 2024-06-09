package com.ism.ecom.api.dto.response;


import com.ism.ecom.data.entities.Chauffeur;
import com.ism.ecom.data.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChauffeurResponseDto {
    private Long id;
    private String nomComplet;
    private String email;
    private String telephone;
    private String vehicule;



    public static ChauffeurResponseDto toDto(Chauffeur chauffeur){
        return ChauffeurResponseDto
                .builder()
                .id(chauffeur.getId())
                .nomComplet(chauffeur.getNomComplet())
                .telephone(chauffeur.getTelephone())
                .email(chauffeur.getEmail())
                .vehicule(chauffeur.getVehicule().getPlaque())
                .build();
    }
}
