package com.github.carlosbotelho.citiesapi.resources;

import com.github.carlosbotelho.citiesapi.entities.City;
import com.github.carlosbotelho.citiesapi.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityRepository repository;

    @GetMapping
    public Page<City> cities(Pageable page){
        return repository.findAll(page);
    }
}
