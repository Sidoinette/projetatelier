package com.ism.ecom.services;

import com.ism.ecom.data.entities.Client;
import com.ism.ecom.api.dto.request.ClientCreateRequestDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ClientService {
      Page<Client> getAllClientWithPaginateAndFilter(String keyword, Pageable page);
      void addClient(ClientCreateRequestDto dto);
      Client getClientById(Long id);
      Client getClientByTelephone(String telephone);

      Page<Client> getAllClientWithPaginate(Pageable page);
}
