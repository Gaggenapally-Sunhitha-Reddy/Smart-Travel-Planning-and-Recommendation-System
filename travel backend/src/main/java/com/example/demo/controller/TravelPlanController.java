package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.TravelPlan;
import com.example.demo.service.TravelPlanService;

@RestController
@RequestMapping("/travelplan")
@CrossOrigin("*")
public class TravelPlanController {

    @Autowired
    private TravelPlanService service;

    @PostMapping
    public TravelPlan createPlan(@RequestBody TravelPlan plan){
        return service.createPlan(plan);
    }
}