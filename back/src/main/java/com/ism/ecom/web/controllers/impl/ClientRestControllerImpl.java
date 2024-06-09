package com.ism.ecom.web.controllers.impl;

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
public class ClientRestControllerImpl implements EtudiantRestController {

    @Override
    public ResponseEntity<Map<Object, Object>> listerEtudiants(int page, int size, String keyword) {

        /*Page<Etudiant> etudiants=etudiantsService.findEdutiantByActiveTrue (PageRequest.of(page,size));
        Page<EtudiantResponseDto> dataDto = etudiants.map(EtudiantResponseDto::toDto);
        Map<Object, Object>  model= RestResponse.paginateResponse(dataDto.getContent(),new int[dataDto.getTotalPages()],dataDto.getNumber(),dataDto.getTotalElements(),dataDto.getTotalPages(), HttpStatus.OK);

        return new ResponseEntity<>(model, HttpStatus.OK);
         */
        return null;
    }

    @Override
    public ResponseEntity<Map<Object, Object>> save(EtudiantRequestDto etudiantRequestDto, BindingResult bindingResult) {
        /*Map<Object, Object> response;
        if (bindingResult.hasErrors()){
            Map<String, String> errors =new HashMap<>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            fieldErrors.forEach(fieldError -> errors.put(fieldError.getField(),fieldError.getDefaultMessage()));
            response= RestResponse.response(errors, HttpStatus.NOT_FOUND);
        }else{
            etudiantRequestService.add(etudiantRequestDto);
            response= RestResponse.response(etudiantRequestDto,HttpStatus.CREATED);
        }

         */
        //return new ResponseEntity<>(response, HttpStatus.OK);
        return null;
    }




}
