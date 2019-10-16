package com.sumant.calendarservice.service;

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
	
	public Optional<Calendar> getDayDetails(Date date) {
		return calendarRepository.findById(date);
	}

}
