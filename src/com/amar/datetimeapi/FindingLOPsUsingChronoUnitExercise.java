package com.amar.datetimeapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//consider the roblem of finding out the number of LOPs between two given dates
public class FindingLOPsUsingChronoUnitExercise {

	public static long calculateLOPs(String startDateLop ,String endDateLop) throws ParseException
	{
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
		Date start = format.parse(startDateLop);
		Date end = format.parse(endDateLop);
		long diff = end.getTime()-start.getTime();
		long lops = diff / (24*60*60*1000);
		return lops + 1 ;
	}
	
	//solve the above problem using the methods and enum constants of ChronoUnit.
}
