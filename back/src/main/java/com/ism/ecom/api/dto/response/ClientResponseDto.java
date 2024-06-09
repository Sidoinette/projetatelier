package com.ism.ecom.web.dto.response;


import com.ism.ecom.data.entities.Client;
import com.ism.ecom.data.entities.Course;
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
public class ClientResponseDto {
    private Long id;
    private String nomComplet;
    private String email;
    private String telephone;
    private List<Course> courses = new ArrayList<Course>();


    public static ClientResponseDto toDto(Client client){
        return ClientResponseDto
                .builder()
                .id(client.getId())
                .nomComplet(client.getNomComplet())
                .telephone(client.getTelephone())
                .email(client.getEmail())
                .build();
    }
}
