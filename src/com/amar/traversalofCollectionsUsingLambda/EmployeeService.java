package com.amar.traversalofCollectionsUsingLambda;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1 = new Employee(101, "Aron", "France");
        Employee e2 = new Employee(102, "Cindia", "Uzbekistan");
        Employee e3 = new Employee(103, "Zindane", "Singapore");
        Employee e4 = new Employee(101, "Emilla", "Mongolia");
        
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(e1);
        listEmp.add(e2);
        listEmp.add(e3);
        listEmp.add(e4);
        
        //Traditional for-each loop
       /* for(Employee e : listEmp)
        {
        	System.out.println(e.getCountry());
        }*/
        
        //Traversing using forEach() method by using Lambda.
        
        listEmp.forEach((emp)->System.out.println(emp.getCountry()));
	}

}

//We can traverse through a collection in different ways as using Iterator,for loop or while loop etc.
//But the developer neeed to know Two things.1)How ,2)What.
//1.)How:Need to know how to crate the iterator ,how to loop through the list and searching for the next elements etc.
//2)What:Business logic need to be performed.
//for-each loop is the external iteration.

//From java 8 we dont nned to do step 1 and we only need to take care of the business logic by using forEach() method and using Lambda Expressions.

//forEach() method is internal iteration .



