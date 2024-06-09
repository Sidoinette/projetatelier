package com.ism.ecom.services.impl;

import com.ism.ecom.data.entities.Client;
import com.ism.ecom.data.entities.Trajet;
import com.ism.ecom.data.repositories.ClientRepository;
import com.ism.ecom.data.repositories.TrajetRepository;
import com.ism.ecom.exceptions.EntityNotFoundException;
import com.ism.ecom.services.ClientService;
import com.ism.ecom.services.TrajetService;
import com.ism.ecom.api.dto.request.ClientCreateRequestDto;
import com.ism.ecom.api.dto.request.TrajetCreateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TrajetServiceImpl implements TrajetService {
    private final TrajetRepository trajetRepository;
    @Override
    public Page<Trajet> getTrajet(Pageable page) {
        return trajetRepository.findAllByActiveTrue(page);
    }

    @Override
    public void addTrajet(Trajet dto) {
        trajetRepository.save(dto);
    }
}
