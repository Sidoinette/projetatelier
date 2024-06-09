package com.ism.ecom.data.fixtures;


import com.ism.ecom.data.entities.Chauffeur;
import com.ism.ecom.data.entities.Trajet;
import com.ism.ecom.data.repositories.ClientRepository;
import com.ism.ecom.data.repositories.TrajetRepository;
import com.ism.ecom.security.services.SecurityService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Order(2)
public class TrajetFixtures implements CommandLineRunner {
    private final TrajetRepository trajetRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 5; i++) {
            Trajet data=new Trajet();
            data.setDepart("Liberte "+i);
            data.setArriver("Liberte "+(i+1));
            data.setActive(i % 2 == 0);
            trajetRepository.save(data);
        }
    }
}
