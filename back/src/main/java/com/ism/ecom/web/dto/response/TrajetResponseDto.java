package com.ism.ecom.web.dto.response;


import com.ism.ecom.data.entities.Trajet;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
public class TrajetResponseDto {
    private Long id;
    private String depart;
    private String arriver;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private int placeTotal;
    private int placeDispo;
    private double prix;


    public static TrajetResponseDto toDto(Trajet trajet){
        return TrajetResponseDto
                .builder()
                .id(trajet.getId())
                .date(trajet.getDate())
                .depart(trajet.getDepart())
                .arriver(trajet.getArriver())
                .placeDispo(trajet.getPlaceDispo())
                .placeTotal(trajet.getPlaceTotal())
                .build();
    }
}
