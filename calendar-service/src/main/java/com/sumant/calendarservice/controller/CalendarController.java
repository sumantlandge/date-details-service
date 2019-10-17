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
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-M-yyyy");
		try {
			Date newdate = dateformat.parse(date);
			Optional<Calendar> data = calendarService.getDayDetails(newdate);
			System.out.println(data.get());
			return calendarService.getDayDetails(newdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
