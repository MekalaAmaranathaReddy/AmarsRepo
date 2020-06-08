package com.amar.functionalinterfacepredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TechSolLuckyDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating 5 instances of Employee
		
		Employee e1 = new Employee(1001, "Aron", "spain");
		Employee e2 = new Employee(1050, "Cindia", "Portugal");
		Employee e3 = new Employee(1602, "Zindane", "France");
		Employee e4 = new Employee(1453, "Robert", "Belgium");
		Employee e5 = new Employee(1500, "Francis", "India");
		
		
		//listEmpIds is the populated list of emp ids
		
		List<Integer> lstEmpIds = new ArrayList<>();
		lstEmpIds.add(e1.getEmpId());
		lstEmpIds.add(e2.getEmpId());
		lstEmpIds.add(e3.getEmpId());
		lstEmpIds.add(e4.getEmpId());
		lstEmpIds.add(e5.getEmpId());
		//printing even numbers
        System.out.println("Printing are Even Employee Ids");
        evaluate(lstEmpIds,(n)-> n % 2==0);
        System.out.println("Printing Odd Employee Ids");
        evaluate(lstEmpIds ,(n) -> n % 2 == 1);
        System.out.println("Printing Employee Ids less than 1500");
        evaluate(lstEmpIds ,(n)-> n < 1500);
//here what we have achieved is with a single evaluate()method we have passed different implementations with help of Lambda functions & unctional inteeraces . 
	}
	public static void evaluate(List<Integer> empList ,Predicate<Integer> predicateArg)
	{
		for(Integer empId :empList)
		{
			if(predicateArg.test(empId))
				System.out.println(empId);
		}
	}

}
