package com.amar.streams_map;

import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> lstEmp = Employee.getEmpList();
		//displaying the sample data
		System.out.println("*******sample Data********");
		lstEmp.forEach((emp)->System.out.println(emp.getId()+" : "+emp.getName()+" : "+emp.getSal()));
		//displaying the data after applying filter and increasing salary
		System.out.println("*******Data after applying filter and inceasing salary");
		
		List<Employee> newEmpList = lstEmp.stream().filter((emp)->emp.getYearsInOrg()<1).map(e->{e.setSal(e.getSal()+5000 );return e;}).collect(Collectors.toList());
         newEmpList.forEach((emp)->System.out.println(emp.getId()+" : "+emp.getName()+" : "+emp.getSal()));
	//map method is used for applying modifications based on requirement and applies it ot to every element and maps to the new List.
    //collect() method is used for to change the Stream to another form .Here we are converting the Stream to List.  
	}

}
