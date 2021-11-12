package com.github.carlosbotelho.citiesapi.resources;

import com.github.carlosbotelho.citiesapi.entities.State;
import com.github.carlosbotelho.citiesapi.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository repository;


    @GetMapping
    public List<State>getAll(){
        return repository.findAll();
    }

}
