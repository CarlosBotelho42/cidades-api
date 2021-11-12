package com.github.carlosbotelho.citiesapi.repositories;

import com.github.carlosbotelho.citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
