package com.sumant.calendarservice.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sumant.calendarservice.model.Calendar;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Date> {

}
