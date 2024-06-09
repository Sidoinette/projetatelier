package com.ism.ecom.services;

import com.ism.ecom.data.entities.Trajet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TrajetService {
      Page<Trajet> getTrajet(Pageable page);
      void addTrajet(Trajet dto);
}
