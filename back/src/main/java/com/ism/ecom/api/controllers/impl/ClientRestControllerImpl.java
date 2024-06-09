package com.ism.ecom.api.controllers.impl;

import com.ism.ecom.api.controllers.ClientRestController;
import com.ism.ecom.api.dto.response.ClientResponseDto;
import com.ism.ecom.data.entities.Client;
import com.ism.ecom.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
@CrossOrigin(value = "http://localhost:4200")
public class ClientRestControllerImpl implements ClientRestController {
    private final ClientService clientService;

    @Override
    public ResponseEntity<Map<Object, Object>> listerEtudiants(int page, int size, String keyword) {
        Page<Client> clients=clientService.getAllClientWithPaginate (PageRequest.of(page,size));
        Page<ClientResponseDto> dataDto = clients.map(ClientResponseDto::toDto);
        Map<Object, Object>  model= com.ism.ecom.api.dto.RestResponse.paginateResponse(dataDto.getContent(),new int[dataDto.getTotalPages()],dataDto.getNumber(),dataDto.getTotalElements(),dataDto.getTotalPages(), HttpStatus.OK);
        return new ResponseEntity<>(model, HttpStatus.OK);
    }

    //http://localhost:4200/api




}
