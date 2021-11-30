package com.flightapp.admin.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.admin.service.beans.Airlines;
import com.flightapp.admin.service.mapper.AdminMapper;

@RestController
public class AdminController {

	@Autowired
	private AdminMapper mapper;

	@PostMapping("/api/v1.0/airlines")
	public String createAirlines(@RequestBody Airlines airline) {
		try {
			mapper.createAirlines(airline);
			return "Airline created Successfully";
		} catch (Exception e) {
			return e.getMessage();
		}

	}
	
	@GetMapping("/api/v1.0/airlines/block/{airline}")
	public String blockAirlines(@PathVariable String airline) {
		try {
			if(mapper.checkBlockedStatus(airline).get(0).getIsBlocked().equals("Y")){
				return "Airline already blocked";
			}
			else {
				mapper.blockAirline(airline);
				return "Airline blocked Successfully";
			}
		} catch (Exception e) {
			return e.getMessage();
		}

	}
	
	@GetMapping("/api/v1.0/airlines/unblock/{airline}")
	public String unblockAirlines(@PathVariable String airline) {
		try {
			if(mapper.checkBlockedStatus(airline).get(0).getIsBlocked().equals("N")) {
				return "Airline not blocked";
			}
			else {
				mapper.unblockAirline(airline);
				return "Airline unblocked Successfully";
			}
		} catch (Exception e) {
			return e.getMessage();
		}

	}

	@GetMapping("/hello")
	public String Hello() {
		return "Hello";
	}

}
