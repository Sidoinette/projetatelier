package com.ism.ecom.api.controllers;

import com.ism.ecom.api.dto.request.TrajetCreateRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface TrajetRestController {
    @GetMapping("/trajet")//End Point
    ResponseEntity<Map<Object, Object>> listerTrajet(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "8") int size
    );

    @PostMapping("/trajets")
    public ResponseEntity<Map<Object, Object>>  saveTrajet(TrajetCreateRequestDto trajet, BindingResult bindingResult) ;
    //@PostMapping("/etudiants")
    //ResponseEntity<Map<Object, Object>> save(@Valid @RequestBody com.ism.ecom.web.dto.request.ClientCreateRequestDto etudiantRequestDto, BindingResult bindingResult);

}
