package com.amar.needOfLambdaExpressionUsingFunctionalInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingEmployeeBasedOnCountry {
	Employee employee1 = new Employee("Amar","27",50000);
	Employee employee2 = new Employee("Nath","27",100000);
	List<Employee> empList = new ArrayList<>();
	
	public void sortEmployeesByCountry(List<Employee> employeeList)
	{
		
		//employeeList.sort(new EmployeeSortingComparator()); //By using the traditonal Comparator implementation class
		
		//Following is based on Inner classes
		
		/*employeeList.sort(new Comparator<Employee>()
		
				{
			        public int compare(Employee emp1,Employee emp2)
			        {
			        	return emp1.getEmployeeName().compareTo(emp2.getEmployeeName());
			        }
			        
				});*/
		
		//above is easy but its difficult to write the cde y follwing the inner classes syntax.
		//so we can achieve the same thing by using Lambda Expression .
		
		//Using Lambda Expression
		
		/*employeeList.sort((Employee emp1,Employee emp2)->
		
			 emp1.getEmployeeName().compareTo(emp2.getEmployeeName()));*/
		
		
		
		//The above code shall be written also as below
		Comparator<Employee> comparator = (Employee emp1,Employee emp2) ->
	   	                                                                   emp1.getEmployeeName().compareTo(emp2.getEmployeeName());
	   	                                                                   
	   	                                 employeeList.sort(comparator);                     
		
	}

}
