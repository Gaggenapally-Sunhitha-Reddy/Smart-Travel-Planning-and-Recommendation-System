package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.TravelPlan;

public interface TravelPlanRepository extends JpaRepository<TravelPlan,Long>{

}