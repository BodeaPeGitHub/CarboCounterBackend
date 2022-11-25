package com.example.carbcounter.repository;

import com.example.carbcounter.model.Meal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MealRepository extends CrudRepository<Meal, Long> {
    List<Meal> findAll();

    Meal findMealById(Long id);
}
