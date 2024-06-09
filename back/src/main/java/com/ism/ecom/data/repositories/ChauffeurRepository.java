package com.ism.ecom.data.repositories;

import com.ism.ecom.data.entities.Chauffeur;
import com.ism.ecom.data.entities.Chauffeur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChauffeurRepository  extends JpaRepository<Chauffeur,Long> {
    List<Chauffeur> findAllByActiveTrue();
    Chauffeur findChauffeurByTelephoneAndActiveTrue(String telephone);
    Page<Chauffeur> findAllByActiveTrue(Pageable pageable);
    Page<Chauffeur>   findAllByTelephoneContainsAndActiveTrue(String telephone,Pageable pageable);
    List<Chauffeur> findAllByActive(Boolean active);
}
