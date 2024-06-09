package com.ism.ecom.api.dto.request;

import com.ism.ecom.data.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientCreateRequestDto {
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
    public  Client toEntity(){
        Client client = Client.builder()
                .nomComplet(nomComplet)
                .telephone(telephone)
                .email(email)

                .build();
        client.setPassword(password);
        client.setUsername(username);
        return client;
    }



}
