package com.example.carbcounter.service;

import com.example.carbcounter.model.Meal;
import com.example.carbcounter.model.MealDTO;
import com.example.carbcounter.repository.MealDTORepository;
import com.example.carbcounter.repository.MealRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealDTOService {
    @Resource
    private MealDTORepository mealDTORepository;
    @Resource
    private MealRepository mealRepository;

    public List<MealDTO> findAllMeals() {
        return mealDTORepository.findAll();
    }

    public MealDTO save(Long mealId, Double weight) {
        Meal meal = mealRepository.findMealById(mealId);
        MealDTO mealDTO = MealDTO.builder().meal(meal).weight(weight).build();
        return mealDTORepository.save(mealDTO);
    }

    public MealDTO findByMealId(Long id) {
        return mealDTORepository.findMealDTOByMealId(id);
    }
}
