package com.alexandreesl.handson;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAPIShowcase {

	public static void main(String[] args) {

		// Creating a local date

		LocalDate date = LocalDate.now();

		System.out.println(date);

		// Creating a local time

		LocalTime time = LocalTime.now();

		System.out.println(time);

		// Creating a local datetime

		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println(dateTime);

		// timezone datetime

		ZonedDateTime zonedDateTime = ZonedDateTime.now();

		System.out.println("Time at my timezone: " + zonedDateTime);

		zonedDateTime = zonedDateTime.withZoneSameInstant(ZoneId
				.of("Australia/Sydney"));

		System.out.println("Time at Sidney: " + zonedDateTime);

		// instantiating for specific date and/or time

		date = LocalDate.of(2015, 12, 25);

		System.out.println(date);

		dateTime = LocalDateTime.of(2015, 12, 25, 10, 30);

		System.out.println(dateTime);

		// add/removing days, months, years, hours, minutes

		System.out.println("Date before adding days: " + date);

		date = date.plusDays(10);

		System.out.println("Date after adding days: " + date);

		date = date.plusMonths(6);

		System.out.println("Date after adding months: " + date);

		date = date.plusYears(5);

		System.out.println("Date after adding years: " + date);

		date = date.minusDays(7);

		System.out.println("Date after subtracting days: " + date);

		date = date.minusMonths(6);

		System.out.println("Date after subtracting months: " + date);

		date = date.minusYears(10);

		System.out.println("Date after subtracting years: " + date);

		time = time.plusHours(12);

		System.out.println("Time after adding hours: " + time);

		time = time.plusMinutes(30);

		System.out.println("Time after adding minutes: " + time);

		time = time.plusSeconds(120);

		System.out.println("Time after adding seconds: " + time);

		time = time.minusHours(12);

		System.out.println("Time after subtracting hours: " + time);

		time = time.minusMinutes(30);

		System.out.println("Time after subtracting minutes: " + time);

		time = time.minusSeconds(120);

		System.out.println("Time after subtracting seconds: " + time);
		
		//comparing dates
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1);
		
		

	}
}
