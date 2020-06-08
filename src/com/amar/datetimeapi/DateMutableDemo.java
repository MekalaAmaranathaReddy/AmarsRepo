package com.amar.datetimeapi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMutableDemo {
	
	public static void main(String[] args) throws Exception 
	{
		EmployeeService employeeService = new EmployeeService(100045,"Nilekar", new Date());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/YYYY");
		Date joinedDate = simpleDateFormat.parse("23/06/2020");
		
		employeeService.setJoinedDate(joinedDate);
		
		employeeService.setJoinedDate(joinedDate);
		System.out.println(employeeService.getJoinedDate());
		System.out.println(employeeService);
	}

}
