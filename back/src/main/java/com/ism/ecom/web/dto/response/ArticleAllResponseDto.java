package com.ism.ecom.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArticleAllResponseDto {
    private Long id;
    private String libelle;
    private Double ancienPrix;
    private Double nouveauPrix;
    private Boolean promo;
    private Integer qteStock;
    private String photo;
    private CategorieResponseDto categorie;
    public static ArticleAllResponseDto toDto(Article article) {
        return  ArticleAllResponseDto
                .builder()
                .id(article.getId())
                .libelle(article.getLibelle())
                .ancienPrix(article.getAncienPrix())
                .nouveauPrix(article.getNouveauPrix())
                .photo(article.getPhoto())
                .qteStock(article.getQteStock())
                .promo(article.getPromo())
                .categorie(CategorieResponseDto.toDto(article.getCategorie()))
                .build();

    }



}
