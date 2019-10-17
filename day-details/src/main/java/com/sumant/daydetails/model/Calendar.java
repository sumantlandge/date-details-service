package com.sumant.daydetails.model;

import java.sql.Time;
import java.util.Date;
public class Calendar {
	Date date;
	int day;
	String month;
	int year;
	String dayOfWeek;
	String metadata;
	Time sunrise;
	Time sunset;
	
	public Calendar() {
	
	}
	
	public Time getSunrise() {
		return sunrise;
	}
	public void setSunrise(Time sunrise) {
		this.sunrise = sunrise;
	}

	public Time getSunset() {
		return sunset;
	}
	public void setSunset(Time sunset) {
		this.sunset = sunset;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
		return "Calendar [dayId=" + date + ", day=" + day + ", month=" + month + ", year=" + year + ", dayOfWeek="
				+ dayOfWeek + ", metadata=" + metadata + ", sunrise=" + sunrise + ", sunrset=" + sunset + "]";
	}
	
	
}
