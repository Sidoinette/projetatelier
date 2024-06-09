package com.ism.ecom.data.repositories;

import com.ism.ecom.data.entities.Client;
import com.ism.ecom.data.entities.Trajet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrajetRepository extends JpaRepository<Trajet, Long> {

    List<Trajet> findAllByActiveTrue();
    Trajet findByDepartAndArriver(String depart, String arriver);
    Page<Trajet> findAllByActiveTrue(Pageable pageable);

//    Page<Trajet>   findAllByTelephoneContainsAndActiveTrue(String telephone,Pageable pageable);

    List<Trajet> findAllByArriver(String arriver);
}
