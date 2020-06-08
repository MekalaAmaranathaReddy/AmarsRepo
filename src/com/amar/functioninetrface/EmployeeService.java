package com.amar.functioninetrface;

import java.util.List;
import java.util.function.Function;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We can use Function interface if we have a requirement that input argument is differenrt and return type is different.
		//We need to specify the return type in the interface declaration itself .
        
		List<Employee> listEmp = Employee.getEmployeeList();
		for(Employee e :listEmp)
		{
			Double sal = computeSalary(e, e1-> e1.getSal()*1.1); // 10% salary increment
			System.out.println(e.getEmpName()+": Old Salary : "+e.getSal()+", new salary: "+sal);
		}
	}
	public static double computeSalary(Employee e ,Function<Employee ,Double > fn)
	{
		return fn.apply(e);
	}

}
