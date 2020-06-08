package com.amar.consumerfunctionalinterface;

import java.util.List;
import java.util.function.Consumer;

public class EmployeeService {
//Consumer functional interface can be used if we have only single argument and there is no return type ,we will just use the whatever passed as argument .
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		List<Employee> listEmp = Employee.getEmpList();
		System.out.println("**********Generating HR Report**********");
		generateReport(listEmp, (e)->System.out.println(e.getId()+" : "+e.getName()+" : "+e.getRole()+" : "+e.getSal()));
		System.out.println("\n**********Generating Manager Report ************");
		generateReport(listEmp, (e) -> System.out.println(e.getId()+" : "+e.getName()+" : "+e.getRole()));
	}
	public static void generateReport(List<Employee> lstEmp , Consumer<Employee> consumer)
	{
		for(Employee e : lstEmp)
		{
			consumer.accept(e);
		}
	}

}
