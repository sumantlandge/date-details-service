package com.sumant.calendarservice.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumant.calendarservice.dao.CalendarRepository;
import com.sumant.calendarservice.model.Calendar;

@Service
public class CalendarService {
	
	@Autowired
	private CalendarRepository calendarRepository;
	
	public Optional<Calendar> getDayDetails(String date) {
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-M-yyyy");
		try {
			Date newdate = dateformat.parse(date);
			Optional<Calendar> data = calendarRepository.findById(newdate);
			System.out.println(data.get());
			return data;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
