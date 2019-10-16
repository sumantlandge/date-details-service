package com.sumant.daydetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sumant.daydetails.model.Calendar;

@RestController
public class ApplicationController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/get/{date}")
	Calendar getDetails(@PathVariable("date") String date) {
		System.out.println("application: "+date);
		Calendar dayDetails = restTemplate.postForObject("http://localhost:8081/getdetails", date, Calendar.class);
		return dayDetails;
	}
}
