package com.amar.streams_reduce_method;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		List<Employee> lstEmp = Employee.getEmpList();
		
		List<Employee> lstNewEmp = lstEmp.stream().filter((emp)->emp.getYearsInOrg()<1).map((emp)->{emp.setSal(emp.getSal()+5000);return emp;}).collect(Collectors.toList());
	    System.out.println("Employees less than a year old with increment");
	    lstNewEmp.forEach((emp)->System.out.println(emp.getId()+" : "+emp.getName()+" : "+emp.getSal()));
	    
	    //Finding the maximum salary
	    Optional<Integer> max = lstNewEmp.stream().map(e->e.getSal()).reduce(Integer::max);
	    
	    List<Employee> lstMaxEmp = lstNewEmp.stream().filter(e->e.getSal().equals(max.get())).collect(Collectors.toList());
	    System.out.println("\nEmployees having maximum salary after increment :");
	    lstMaxEmp.forEach(e->System.out.println(e.getId()+" : "+e.getName()+" : "+e.getSal()));
	}

}

//Calculate the sum of the first 50 whole numbers using iterate() and reduce() methods of Stream.
















