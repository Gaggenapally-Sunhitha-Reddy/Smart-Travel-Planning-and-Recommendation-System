package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TravelPlan;
import com.example.demo.repository.TravelPlanRepository;

@Service
public class TravelPlanService {

    @Autowired
    private TravelPlanRepository repo;

    // Create travel plan and generate itinerary
    public TravelPlan createPlan(TravelPlan plan) {

        String itinerary = generateItinerary(plan.getDays());

        plan.setItinerary(itinerary);

        return repo.save(plan);
    }

    // Method to generate different activities for each day
    public String generateItinerary(int days) {

        StringBuilder itinerary = new StringBuilder();

        String[] activities = {
            "Arrival and city tour",
            "Visit famous landmarks",
            "Local food exploration",
            "Museum and cultural visit",
            "Adventure activities",
            "Beach relaxation",
            "Shopping and Departure"
        };

        for (int i = 1; i <= days; i++) {

            if (i == 1) {

                itinerary.append("Day 1 : Arrival and city tour\n");

            } 
            else if (i == days) {

                itinerary.append("Day " + i + " : Shopping and Departure\n");

            } 
            else {

                int index = i % activities.length;

                itinerary.append("Day " + i + " : " + activities[index] + "\n");

            }
        }

        return itinerary.toString();
    }
}