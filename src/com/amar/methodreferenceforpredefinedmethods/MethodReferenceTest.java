package com.amar.methodreferenceforpredefinedmethods;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1 = new Employee(101, "Aron", "Spain");
       Employee e2 = new Employee(101, "Cindia", "Portugal");
       Employee e3 = new Employee(101, "Zindane", "France");
       List<Employee> empList = new ArrayList<>();
       empList.add(e1);
       empList.add(e2);
       empList.add(e3);
       //sorting the list
       System.out.println("Before Sorting : "+empList);
       empList.sort(Employee::compareByCountry);//Using method reference concept  of static method implementation of Employee class 
       System.out.println("After Sorting : "+empList);
	}
	
	//Q )What is the equivalance method reference for the given lambda expression?
	
	//(String s) -> System.out.println(s);
	
	//Answer :System.out::println ;
	

}
