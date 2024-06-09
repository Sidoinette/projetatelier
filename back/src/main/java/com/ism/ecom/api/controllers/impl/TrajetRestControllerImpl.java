package com.ism.ecom.api.controllers.impl;

import com.ism.ecom.api.controllers.TrajetRestController;
import com.ism.ecom.api.dto.RestResponse;
import com.ism.ecom.api.dto.request.TrajetCreateRequestDto;
import com.ism.ecom.api.dto.response.TrajetResponseDto;
import com.ism.ecom.data.entities.Trajet;
import com.ism.ecom.services.TrajetService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
@CrossOrigin(value = "http://localhost:4200")
public class TrajetRestControllerImpl implements TrajetRestController {
    private final TrajetService trajetService;

    @Override
    public ResponseEntity<Map<Object, Object>> listerTrajet(int page, int size) {
        Page<Trajet> trajets=trajetService.getTrajet (PageRequest.of(page,size));
        Page<TrajetResponseDto> dataDto = trajets.map(TrajetResponseDto::toDto);
        Map<Object, Object>  model= RestResponse.paginateResponse(dataDto.getContent(),new int[dataDto.getTotalPages()],dataDto.getNumber(),dataDto.getTotalElements(),dataDto.getTotalPages(), HttpStatus.OK);
        return new ResponseEntity<>(model, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Map<Object, Object>> saveTrajet(TrajetCreateRequestDto trajet, BindingResult bindingResult) {
        Map<Object, Object> response;
        if (bindingResult.hasErrors()){
            Map<String, String> errors =new HashMap<>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            fieldErrors.forEach(fieldError -> errors.put(fieldError.getField(),fieldError.getDefaultMessage()));
            response= RestResponse.response(errors, HttpStatus.NOT_FOUND);
        }else{
            System.out.println("ok");
            System.out.println(trajet);
            trajetService.addTrajet(trajet);
            response= RestResponse.response(trajet,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);


    }

    //http://localhost:4200/api




}
