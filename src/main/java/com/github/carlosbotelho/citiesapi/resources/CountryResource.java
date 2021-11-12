package com.github.carlosbotelho.citiesapi.resources;

import com.github.carlosbotelho.citiesapi.entities.Country;
import com.github.carlosbotelho.citiesapi.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page){
        return  repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getById(@PathVariable Long id){
        Optional<Country> optional =  repository.findById(id);
        return ResponseEntity.ok().body(optional.get());
    }
}
