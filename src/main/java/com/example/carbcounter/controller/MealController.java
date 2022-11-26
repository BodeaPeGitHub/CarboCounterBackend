package com.example.carbcounter.controller;

import com.example.carbcounter.model.FoodDetection;
import com.example.carbcounter.model.Meal;
import com.example.carbcounter.service.MealService;
import jakarta.annotation.Resource;
import org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException;
import org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("meals")
public class MealController {
    @Resource
    private MealService mealService;

    @GetMapping
    public ResponseEntity<?> findAllMeals() {
        return new ResponseEntity<>(mealService.findAllMeals(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findMealById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(mealService.findMealById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Meal meal) {
        return new ResponseEntity<>(mealService.save(meal), HttpStatus.OK);
    }

    @PostMapping("/detect")
    public ResponseEntity<?> detect(@RequestBody String base64){
        System.out.println(base64);
        try {
            FoodDetection.detectFood(base64);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<String>(base64, HttpStatus.OK);
    }
}
