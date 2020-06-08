package com.amar.needOfLambdaExpressionUsingFunctionalInterface;

public class Employee {
	
public String employeeName ;
public String age;
public double salary ;

public Employee(String employeeName,String age ,double salary)
{
	this.employeeName = employeeName;
	this.age =age ;
	this.salary =salary ;
}

public final String getEmployeeName() {
	return employeeName;
}

public final void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public final String getAge() {
	return age;
}

public final void setAge(String age) {
	this.age = age;
}

public final double getSalary() {
	return salary;
}

public final void setSalary(double salary) {
	this.salary = salary;
}

}
