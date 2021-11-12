package com.github.carlosbotelho.citiesapi.repositories;

import com.github.carlosbotelho.citiesapi.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
