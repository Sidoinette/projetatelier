package com.ism.ecom.services;

import com.ism.ecom.data.entities.Chauffeur;
import com.ism.ecom.api.dto.request.ClientCreateRequestDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ChauffeurService {
    Page<Chauffeur> getAllChauffeurWithPaginateAndFilter(String keyword, Pageable page);
    void addChauffeur(ClientCreateRequestDto dto);
    Chauffeur getChauffeurById(Long id);
    Chauffeur getChauffeurByTelephone(String telephone);
}
