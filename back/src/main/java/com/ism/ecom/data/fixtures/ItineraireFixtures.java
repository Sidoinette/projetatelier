package com.ism.ecom.data.fixtures;


import com.ism.ecom.data.entities.Itineraire;
import com.ism.ecom.data.entities.Trajet;
import com.ism.ecom.data.entities.Vehicule;
import com.ism.ecom.data.repositories.ItineraireRepository;
import com.ism.ecom.data.repositories.TrajetRepository;
import com.ism.ecom.data.repositories.VehiculeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@RequiredArgsConstructor
@Order(5)
public class ItineraireFixtures implements CommandLineRunner {
    private final ItineraireRepository itineraireRepository;
    private final TrajetRepository trajetRepository;
    private final VehiculeRepository vehiculeRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Itineraire> itineraireList=new ArrayList<Itineraire>();
        for (int i = 1; i <= 5; i++) {
            Trajet trajet = trajetRepository.findById(Long.valueOf(i)).orElse(null);
            if (trajet!=null){
                for (int j = 0; j < 5; j++) {
                    Vehicule vehicule = vehiculeRepository.findById(Long.valueOf(j)).orElse(null);
                    if (vehicule!=null){
                        Random random = new Random();
                        int randomNumber = random.nextInt(100) + j;
                        Itineraire itineraire = new Itineraire();
                        itineraire.setPrix(1000*(j+1));
                        itineraire.setTrajet(trajet);
                        itineraire.setVehicule(vehicule);
                        itineraire.setDate(LocalDate.of(2024,j+1,20));
                        itineraire.setActive(j%2==0);
                        itineraireList.add(itineraire);
                    }
                }
            }
        }
        itineraireRepository.saveAllAndFlush(itineraireList);
    }
}
