package com.amar.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AllLocalDateTimeExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("********Local Date*******");
      LocalDate registrationDate = LocalDate.now();//creates an object with system date
      System.out.println("Today's date(System date) : "+registrationDate);
      LocalDate lastDate = registrationDate.plusDays(3);//Adding 3 days to the registration date
      System.out.println("Adding 3 days " +lastDate);
      if(LocalDate.now().isBefore(lastDate))  //checking whether current date is before last date.
      {
    	  System.out.println("Please take the assessment as soon as possible");
      }
      System.out.println();
      System.out.println("*******LocalTime********");
      LocalTime startTime = LocalTime.now();//creates an object with system time
      System.out.println("Start Time "+startTime);//the time being returned from here is according to the region/Locale/zone in which the application is hosted.
      
      LocalTime endTime = startTime.plusHours(1);//Adding 1 hour
      System.out.println("End Time "+endTime);//the time being returned from here is according to the region/Locale/zone in which the application is hosted.
      
      LocalTime current = LocalTime.now();
      int hour = current.getHour();        //Getting Hour , Minutes ,Seconds
      int minutes = current.getMinute();
      int seconds = current.getSecond();
      System.out.println("Hour "+hour+" Minutes "+minutes+" Seconds "+seconds);
      
      System.out.println();
      System.out.println("**********LocalDateTime********");
      LocalDateTime dateTime = LocalDateTime.now();
      System.out.println("Date and Time "+dateTime);
      System.out.println(dateTime.minusDays(3));//subtracting 3 days
      
      
      //working with ZonedDateTime
      System.out.println("*********ZonedDateTime*********");
      System.out.println(ZonedDateTime.now());
      System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Athens")));
      //Zone can be specified as required . Otherwise , the default system Zone is used .
      
      //Working with Period
      System.out.println("********working with Period********");
      LocalDate startDate = LocalDate.of(2020,3,11);
      LocalDate endDate = LocalDate.of(2020,3,21);
      
      long lops = calculateLOPs(startDate, endDate);
      System.out.println("NUmber Of LOPs "+lops);
      
      //Working with DateTimeFormatter
  	  
  	  System.out.println("*********DateTimeFormatter**********");
  	  LocalDate paySlipDate = LocalDate.now();
  	  System.out.println(paySlipDate);
  	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/YYYY");
  	  System.out.println(paySlipDate.format(formatter));
      
  	//working with ChronoUnit
  	System.out.println("********ChronoUnit*******");
  	LocalDate today = LocalDate.now();
  	System.out.println("Today's date : "+today);
  	LocalDate after = today.plus(1,ChronoUnit.MONTHS);
  	System.out.println("date after one month : "+after);
	}
	
	
	
	public static  long calculateLOPs(LocalDate startDateLop,LocalDate endDateLop)
    {
  	  Period period = Period.between(startDateLop, endDateLop);
  	  int lops = period.getDays();
  	  return lops+1 ;
  	  //for the between() method , the start date is included ,but the end date is not .Thats why we have added 1 externaly .
  	  
  	  
    }

}




