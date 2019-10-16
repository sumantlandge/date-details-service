package com.sumant.calendarservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Calendar {
	@Id
	Date dayId;
	int day;
	String month;
	int year;
	String dayOfWeek;
	String metadata;
	
	public Date getDayId() {
		return dayId;
	}
	public void setDayId(Date dayId) {
		this.dayId = dayId;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getMetadata() {
		return metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}
	
	@Override
	public String toString() {
		return "Calendar [dayId=" + dayId + ", day=" + day + ", month=" + month + ", year=" + year + ", dayOfWeek="
				+ dayOfWeek + ", metadata=" + metadata + "]";
	}
}
