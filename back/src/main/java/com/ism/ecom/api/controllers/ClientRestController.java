package com.ism.ecom.api.controllers;

import com.ism.ecom.api.dto.request.ClientCreateRequestDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface ClientRestController {
    @GetMapping("/client")//End Point
    ResponseEntity<Map<Object, Object>> listerEtudiants(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "8") int size,
            @RequestParam( defaultValue = "") String keyword
    );

    @PostMapping("/clients")
    ResponseEntity<Map<Object, Object>> saveClient(@Valid @RequestBody ClientCreateRequestDto client, BindingResult bindingResult);

}
