package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Destination;
import com.example.demo.service.DestinationService;

@RestController
@RequestMapping("/destinations")
@CrossOrigin("*")
public class DestinationController {

	@Autowired
	private DestinationService service;

	@PostMapping
	public Destination addDestination(@RequestBody Destination d){
		return service.addDestination(d);
	}

	@GetMapping
	public List<Destination> getAll(){
		return service.getAllDestinations();
	}

	@GetMapping("/recommend/{type}")
	public List<Destination> recommend(@PathVariable String type){
		return service.recommend(type);
	}
	@GetMapping("/search/{name}")
	public List<Destination> search(@PathVariable String name){
	    return service.search(name);
	}
	@GetMapping("/budget/{amount}")
	public List<Destination> recommendBudget(@PathVariable double amount){
	    return service.recommendByBudget(amount);
	}
}