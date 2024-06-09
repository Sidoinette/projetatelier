package com.ism.ecom.api.dto.request;

import com.ism.ecom.data.entities.Chauffeur;
import com.ism.ecom.data.entities.Trajet;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrajetCreateRequestDto {
    @NotBlank(message = "Le nom est obligatoire")
    private String depart;
    @NotBlank(message = "Le nom est obligatoire")
    private String arriver;
    @NotBlank(message = "Le nom est obligatoire")
    private Date date;
    @NotBlank(message = "Le nom est obligatoire")
    private int placeTotal;
    @NotBlank(message = "Le nom est obligatoire")
    private int placeDispo;
    @NotBlank(message = "Le nom est obligatoire")
    private double prix;


    //Mapper
    public Trajet toEntity(){
        Trajet trajet = Trajet.builder()
                .depart(depart)
                .arriver(arriver)
                .date(date)
                .placeDispo(placeDispo)
                .placeTotal(placeTotal)
                .prix(prix)
                .build();

        return trajet;
    }



}
