package com.amar.optional_classes;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// code to retrieve employees and to store them in a list called
		// employeeList

		List<Employee> employeeList = Employee.getEmpList();
		// List to collect the passport Numbers
		List<Integer> passportNumbers = new ArrayList<>();

		for (Employee employee : employeeList) {
			passportNumbers.add(employee.getPassport().orElse(new Passport(0))
					.getPassportNo());
		}
		passportNumbers.forEach((x) -> System.out.println(x));
	}

}

// Bestsol company has a requirement to fetch the project code of its employees
// and append the same with the string "bestSol"
// There are possibilities that some employees are not allocated to any project
// and have no project code associated with them
// provide a solution for this requirement with possibile null checks

// Using OPtional classes we can avoid null checks externally by d using if
// constraints in the code ,so that we can only focu on the business logic.
// By using this Optional classes we can dcouple the business logic and the code
// for checking the nulls .
// so we can avoid the null checks in the business logic .

