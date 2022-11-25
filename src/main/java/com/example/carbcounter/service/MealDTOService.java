package com.example.carbcounter.service;

import com.example.carbcounter.model.MealDTO;
import com.example.carbcounter.repository.MealDTORepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealDTOService {
    @Resource
    private MealDTORepository mealDTORepository;

    public List<MealDTO> findAllMeals() {
        return mealDTORepository.findAll();
    }

    public MealDTO save(MealDTO mealDTO) {
        return mealDTORepository.save(mealDTO);
    }

    public MealDTO findByMealId(Long id) {
        return mealDTORepository.findMealDTOByMealId(id);
    }
}
