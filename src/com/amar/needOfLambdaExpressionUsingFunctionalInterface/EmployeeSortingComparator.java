package com.amar.needOfLambdaExpressionUsingFunctionalInterface;

import java.util.Comparator;

public class EmployeeSortingComparator implements  Comparator<Employee>{

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		return employee1.getEmployeeName().compareTo(employee2.getEmployeeName());
	}

}
