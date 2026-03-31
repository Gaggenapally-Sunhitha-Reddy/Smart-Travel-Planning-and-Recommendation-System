package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Destination;
import com.example.demo.repository.DestinationRepository;

@Service
public class DestinationService {

	@Autowired
	private DestinationRepository repository;

	public Destination addDestination(Destination d){
		return repository.save(d);
	}

	public List<Destination> getAllDestinations(){
		return repository.findAll();
	}

	public List<Destination> recommend(String type){
		return repository.findByType(type);
	}
	public List<Destination> search(String name){
	    return repository.findByNameContainingIgnoreCase(name);
	}
	public List<Destination> recommendByBudget(double amount){
	    return repository.findByBudgetLessThanEqual(amount);
	}
}