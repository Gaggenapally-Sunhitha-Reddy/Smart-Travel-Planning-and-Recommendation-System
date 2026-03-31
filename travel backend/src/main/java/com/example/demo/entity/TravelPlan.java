package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class TravelPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String destination;
    private int days;
    private double budget;
    private String itinerary;

    public TravelPlan(){}

    public Long getId(){ return id; }
    public void setId(Long id){ this.id=id; }

    public Long getUserId(){ return userId; }
    public void setUserId(Long userId){ this.userId=userId; }

    public String getDestination(){ return destination; }
    public void setDestination(String destination){ this.destination=destination; }

    public int getDays(){ return days; }
    public void setDays(int days){ this.days=days; }

    public double getBudget(){ return budget; }
    public void setBudget(double budget){ this.budget=budget; }

    public String getItinerary(){ return itinerary; }
    public void setItinerary(String itinerary){ this.itinerary=itinerary; }
}