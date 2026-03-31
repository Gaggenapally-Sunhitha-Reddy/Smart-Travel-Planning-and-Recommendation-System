package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@GetMapping
	public String adminDashboard(){
		return "Admin Dashboard Working";
	}
}