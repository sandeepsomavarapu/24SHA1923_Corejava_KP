package com.kpmg.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateAndTimeEx {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfWeek());

		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getNano());
		System.out.println(time.getSecond());

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		LocalDateTime dateTime1 = LocalDateTime.of(1993, 8, 10, 10, 45);
		System.out.println(dateTime1);

		LocalDate date1 = LocalDate.now();// systemdate
		LocalDate bDate = LocalDate.of(1993, 11, 10);
		Period p = Period.between(bDate, date1);
		System.out.printf("ur age %d years,%d months,%d days", p.getYears(), p.getMonths(), p.getDays());
	}

}
