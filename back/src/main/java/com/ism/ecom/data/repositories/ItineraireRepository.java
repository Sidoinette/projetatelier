package com.ism.ecom.data.repositories;

import com.ism.ecom.data.entities.Itineraire;
import com.ism.ecom.data.entities.Trajet;
import com.ism.ecom.data.entities.Vehicule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItineraireRepository extends JpaRepository<Itineraire, Long> {

    List<Itineraire> findAllByActiveTrue();
    Itineraire findByVehiculeAndTrajet(Vehicule vehicule, Trajet trajet);
    Page<Itineraire> findAllByActiveTrue(Pageable pageable);

//    Page<Trajet>   findAllByTelephoneContainsAndActiveTrue(String telephone,Pageable pageable);

    List<Itineraire> findAllByTrajet(Trajet trajet);
    List<Itineraire> findAllByVehicule(Vehicule vehicule);

}
