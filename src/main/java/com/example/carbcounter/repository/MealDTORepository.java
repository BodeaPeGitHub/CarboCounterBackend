package com.example.carbcounter.repository;

import com.example.carbcounter.model.MealDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MealDTORepository extends CrudRepository<MealDTO, Long> {
    List<MealDTO> findAll();

    MealDTO findMealDTOByMealId(Long id);
}
