package com.example.carbcounter.controller;

import com.example.carbcounter.model.MealDTO;
import com.example.carbcounter.service.MealDTOService;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("meals_dto")
public class MealDTOController {
    @Resource
    private MealDTOService mealDTOService;

    @GetMapping
    public ResponseEntity<?> findAllMealsDTO() {
        return new ResponseEntity<>(mealDTOService.findAllMeals(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findByMealId(@PathVariable("id") Long id) {
        return new ResponseEntity<>(mealDTOService.findByMealId(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody MealDTO mealDTO) {
        return new ResponseEntity<>(mealDTOService.save(mealDTO), HttpStatus.OK);
    }
}
