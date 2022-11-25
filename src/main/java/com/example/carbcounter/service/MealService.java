package com.example.carbcounter.service;

import com.example.carbcounter.model.Meal;
import com.example.carbcounter.repository.MealRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    @Resource
    private MealRepository mealRepository;

    public List<Meal> findAllMeals() {
        return mealRepository.findAll();
    }

    public Meal findMealById(Long id) {
        return mealRepository.findMealById(id);
    }

    public Meal save(Meal meal) {
        return mealRepository.save(meal);
    }
}
