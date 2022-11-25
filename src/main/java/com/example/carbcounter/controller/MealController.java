package com.example.carbcounter.controller;

import com.example.carbcounter.model.Meal;
import com.example.carbcounter.service.MealService;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
