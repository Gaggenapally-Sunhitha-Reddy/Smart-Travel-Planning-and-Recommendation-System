package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Long>{

	List<Destination> findByType(String type);
	List<Destination> findByNameContainingIgnoreCase(String name);
	List<Destination> findByBudgetLessThanEqual(double budget);

}