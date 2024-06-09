package com.ism.ecom.data.fixtures;

import com.ism.ecom.data.entities.Chauffeur;
import com.ism.ecom.data.entities.Client;
import com.ism.ecom.data.repositories.ChauffeurRepository;
import com.ism.ecom.data.repositories.ClientRepository;
import com.ism.ecom.data.repositories.VehiculeRepository;
import com.ism.ecom.security.services.SecurityService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

//@Component
@RequiredArgsConstructor
@Order(3)
public class ChauffeurFixtures  implements CommandLineRunner {
    private final ChauffeurRepository chauffeurRepository;
    private final PasswordEncoder passwordEncoder;
    private final SecurityService securityService;
    private final VehiculeRepository vehiculeRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 20; i++) {
            Chauffeur data=new Chauffeur();
            data.setNomComplet("Nom et Prenom"+i);
            data.setTelephone("7740010"+i);
            data.setEmail("mailchauffeur"+i+"@gmail.com");
            data.setActive(i % 2 == 0);
            data.setUsername("chauffeur"+i);
            data.setVehicule(vehiculeRepository.findVehiculeById((long)i));
            data.setPassword(passwordEncoder.encode("passer"));
            chauffeurRepository.save(data);
            securityService.addRoleToUser("chauffeur"+i,"Chauffeur");
        }
    }
}
