package com.ism.ecom.data.fixtures;

import com.ism.ecom.data.entities.Chauffeur;
import com.ism.ecom.data.entities.Trajet;
import com.ism.ecom.data.entities.Vehicule;
import com.ism.ecom.data.repositories.ChauffeurRepository;
import com.ism.ecom.data.repositories.TrajetRepository;
import com.ism.ecom.data.repositories.VehiculeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Order(5)
public class VehiculeFixtures implements CommandLineRunner {
    private final VehiculeRepository vehiculeRepository;
    private final ChauffeurRepository chauffeurRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 10; i++) {
            Chauffeur chauffeur=chauffeurRepository.findById(Long.valueOf(i)).orElse(null);
            if (chauffeur!=null){
                Vehicule data=new Vehicule();
                data.setMarque("marque "+i);
                data.setStatus("status "+i);
                data.setNbrPlaces(3+i);
                data.setChauffeur(chauffeur);
                data.setActive(i % 2 == 0);
                data.setPlaque("plaque"+i);
                vehiculeRepository.save(data);
            }
        }
    }
}
