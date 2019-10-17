package com.sumant.calendarservice.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sumant.calendarservice.model.Calendar;
import com.sumant.calendarservice.service.CalendarService;

@RestController
public class CalendarController {
	@Autowired
	CalendarService calendarService;

	@PostMapping("/getdetails")
	public Optional<Calendar> getDayDetails(@RequestBody String date) {
		return calendarService.getDayDetails(date);
	}
}
