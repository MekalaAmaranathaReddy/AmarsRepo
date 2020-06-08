package com.amar.needOfLambdaExpressionUsingFunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class SortTest {

	public static List<Employee> employeeList = new ArrayList<>();
public static void main(String[] args)
{
	Employee employee1 = new Employee("Nath","27",50000);
	Employee employee2 = new Employee("Amar","27",100000);
	employeeList.add(employee1);
	employeeList.add(employee2);
	
	SortingEmployeeBasedOnCountry sorting = new SortingEmployeeBasedOnCountry();
	
	sorting.sortEmployeesByCountry(employeeList);
	
	for(Employee employee :employeeList)
	{
		System.out.println(employee.getEmployeeName());
	}
	
	
}
	
	
}
