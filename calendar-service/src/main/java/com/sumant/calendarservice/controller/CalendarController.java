package com.sumant.calendarservice.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-M-yyyy");
		 try {
		 Date newdate = dateformat2.parse(date);
		 Optional<Calendar> dt = calendarService.getDayDetails(newdate);
		 Calendar str = dt.get();
		 System.out.println(str);
		 return calendarService.getDayDetails(newdate);
		 } catch (ParseException e) {
		 e.printStackTrace();
		 }
		return null;
	}
}
