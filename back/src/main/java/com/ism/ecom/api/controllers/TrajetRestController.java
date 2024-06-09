package com.ism.ecom.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface TrajetRestController {
    @GetMapping("/trajet")//End Point
    ResponseEntity<Map<Object, Object>> listerTrajet(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "8") int size
    );

    //@PostMapping("/etudiants")
    //ResponseEntity<Map<Object, Object>> save(@Valid @RequestBody com.ism.ecom.web.dto.request.ClientCreateRequestDto etudiantRequestDto, BindingResult bindingResult);

}
