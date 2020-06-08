package com.amar.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class EmployeeServiceDemo {
	
	public static void main(String[] args)
	{
		generatePaySlip();
	}
   public static void generatePaySlip()
   {
	   /*Date paySlipDate = new Date();
	   paySlipDate.setDate(21);
	   paySlipDate.setMonth(11);
	   paySlipDate.setYear(2017);
	   System.out.println(paySlipDate);*/
	   
	   //Fri Dec 21 17:37:46 IST 3917 we are getting the out output for the above style of code
	   //here we are not getting the correct output aas we expected.Our expected month is November
	   //but we got it as December.This is due to in Date class the represntation of January month will start from 0.Its a problem.
	   //And our expected year is 2017 but we got here is 3917 .This is due to in Date class the Year Offset will satrt with 1900.So here 2017 has been added with 1900 and it has resulted as 3917.
	   //Date class has been introduceed in java 1.0 version and we have seen the problems with this version.
	   //In 1.1 java version Calendar class has been introduced.But we are not overcoming all the problems which are exist in the 1.0 version Date class.We have achived only Time Offset in this version .
	   //So people started using the third party libraries like Joda Time API .
	   
	   // In Java8 Date/Time API has been introduced and we have overcome all the problems which are exist in the lower versions.
	   //Following is one example for how to use Date/Time Api classes to replace the above code.
	   /*LocalDate localDate = LocalDate.now();//this will give the current system date whatever has been setted up within the system.
	   localDate.of(2017, 11,21); 
	   Here we are trying to modify the Date that has alreafdy been creaed with now() method of Local Date .
	    Here we can undersatnsd that The Local Date class is not mutable ,thats why we are not able to getting the Specified Date .
	     To get our specified date we can use other methods of Local Date class as like of() method of LocalDate class.
	      
	       
	     
	    
	   System.out.println(localDate);*/
	   
	   
	   LocalDate localDate = LocalDate.of(2017, 11,21);
	   //Here we got the correct out put as we expected
	   //Here we have deirectly ctreated the local object with Of method so that we got the correct method .
	   System.out.println(localDate);
	   
	   LocalTime  localTime = LocalTime.now();
	   localTime.getHour();
	   System.out.println(localTime);
	   System.out.println(localTime);
	   System.out.println(localTime);
	   System.out.println(localTime);
	   System.out.println("Amar has been printed the absolute output");
	   
	   LocalDateTime localDateTime = LocalDateTime.now();
	   ZonedDateTime zoneddateTime = ZonedDateTime.now();
	   
	   
	   System.out.println();
	   System.out.println("Checking the Date compliance");
	   LocalDate localDatee = LocalDate.of(2017,Month.NOVEMBER,30);
	   System.out.println(localDatee);
	   
	   System.out.println();
	   System.out.println("Checking the New Date");
	   LocalDate newLocalDate = LocalDate.of(13,11 ,20);
	   System.out.println(newLocalDate);
	   
	   System.out.println();
	   System.out.println("Finding difference between two Dates");
	   LocalDate new1 = LocalDate.of(2018,11,29);
	   LocalDate new2 = LocalDate.of(2018,11,28);
	   //long difference = ChronoUnit.DAYS.between(new1, new2);
	   System.out.println(new1.compareTo(new2));
	   //System.out.println(difference);

	   
	   String[] str= {"Test" ,"Java8","Features"};
	  Stream<String> stream = Arrays.stream(str);
	  
	  Stream<Integer> inputs = Stream.of(8,7,10,15,20,22,30);
	  System.out.println("printing filter");
	  System.out.println(inputs.filter((n)->n%5==0).count());
	  
	  Optional<String> strr = Optional.of("Initialized");
	  Optional<String> strr3 = Optional.empty();
	  //Optional<String> strr4 = "" ;
	  //Optional<String> strr5 = "Initialized" ;
   }
}

