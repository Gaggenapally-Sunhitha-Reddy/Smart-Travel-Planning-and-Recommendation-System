package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.TravelHistory;
import com.example.demo.service.TravelHistoryService;

@RestController
@RequestMapping("/history")
@CrossOrigin("*")
public class TravelHistoryController {

    @Autowired
    private TravelHistoryService service;

    @PostMapping
    public TravelHistory saveHistory(@RequestBody TravelHistory history){
        return service.saveHistory(history);
    }

    @GetMapping("/{userId}")
    public List<TravelHistory> getHistory(@PathVariable Long userId){
        return service.getUserHistory(userId);
    }
}