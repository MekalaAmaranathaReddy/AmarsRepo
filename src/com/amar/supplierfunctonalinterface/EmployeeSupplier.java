package com.amar.supplierfunctonalinterface;

import java.util.List;
import java.util.function.Supplier;

public class EmployeeSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		List<? extends Employee> lstEmp = Employee.getEmployees();
		
		for(Employee e : lstEmp){
			//System.out.println(e.generateSalarySlip());
			generate(()->e);
		}
		
	}
	
	public static void generate(Supplier<Employee> supplier)
	{
		System.out.println(supplier.get().generateSalarySlip());
	}

}
