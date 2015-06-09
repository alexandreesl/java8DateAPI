package com.alexandreesl.handson;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

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

		date = LocalDate.of(2015, Month.DECEMBER, 25);

		System.out.println(date);

		dateTime = LocalDateTime.of(2015, Month.DECEMBER, 25, 10, 30);

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

		// geting values from dates

		System.out.println("For the date: " + date);

		System.out.println("The year from the date is: " + date.getYear());

		System.out.println("The month from the date is: " + date.getMonth());

		System.out.println("The day from the date is: " + date.getDayOfMonth());

		System.out.println("The era from the date is: " + date.getEra());

		System.out.println("The day of the week is: " + date.getDayOfWeek());

		System.out.println("The day of the year is: " + date.getDayOfYear());

		// comparing dates
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1);

		System.out.println("Is today before tomorrow? "
				+ today.isBefore(tomorrow));

		System.out.println("Is today after tomorrow? "
				+ today.isAfter(tomorrow));

		System.out.println("Is today equal tomorrow? "
				+ today.isEqual(tomorrow));

		// printing the year in different languages

		System.out.println("English: "
				+ today.getMonth().getDisplayName(TextStyle.FULL,
						Locale.ENGLISH));

		System.out.println("Portuguese: "
				+ today.getMonth().getDisplayName(TextStyle.FULL,
						Locale.forLanguageTag("pt")));

		System.out.println("German: "
				+ today.getMonth()
						.getDisplayName(TextStyle.FULL, Locale.GERMAN));

		System.out.println("Italian: "
				+ today.getMonth().getDisplayName(TextStyle.FULL,
						Locale.ITALIAN));

		System.out.println("Japanese: "
				+ today.getMonth().getDisplayName(TextStyle.FULL,
						Locale.JAPANESE));

		System.out.println("Chinese: "
				+ today.getMonth().getDisplayName(TextStyle.FULL,
						Locale.CHINESE));

		// formatting a date

		System.out.println(today.format(DateTimeFormatter
				.ofPattern("dd/MM/yyyy")));

		// calculating the time between dates

		LocalDateTime oneDate = LocalDateTime.now();
		LocalDateTime anotherDate = LocalDateTime.of(1982, Month.JUNE, 21, 20,
				00);

		System.out.println("Days between the dates: "
				+ ChronoUnit.DAYS.between(anotherDate, oneDate));

		System.out.println("Months between the dates: "
				+ ChronoUnit.MONTHS.between(anotherDate, oneDate));

		System.out.println("Years between the dates: "
				+ ChronoUnit.YEARS.between(anotherDate, oneDate));

		System.out.println("Hours between the dates: "
				+ ChronoUnit.HOURS.between(anotherDate, oneDate));

		System.out.println("Minutes between the dates: "
				+ ChronoUnit.MINUTES.between(anotherDate, oneDate));

		System.out.println("Seconds between the dates: "
				+ ChronoUnit.SECONDS.between(anotherDate, oneDate));

		// Testing invalid dates

		LocalDate invalidDate = LocalDate.of(2014, Month.FEBRUARY, 30);

		System.out.println(invalidDate);

	}
}
