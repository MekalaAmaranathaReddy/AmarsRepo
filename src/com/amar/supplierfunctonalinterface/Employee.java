package com.amar.supplierfunctonalinterface;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private  int empId ;
	private String empName ;
	private double sal ;
	private int exp ;
	private String gender ;
	public Employee(int empId, String empName, double sal, int exp,
			String gender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.exp = exp;
		this.gender = gender;
	}
	public final int getEmpId() {
		return empId;
	}
	public final void setEmpId(int empId) {
		this.empId = empId;
	}
	public final String getEmpName() {
		return empName;
	}
	public final void setEmpName(String empName) {
		this.empName = empName;
	}
	public final double getSal() {
		return sal;
	}
	public final void setSal(double sal) {
		this.sal = sal;
	}
	public final int getExp() {
		return exp;
	}
	public final void setExp(int exp) {
		this.exp = exp;
	}
	public final String getGender() {
		return gender;
	}
	public final void setGender(String gender) {
		this.gender = gender;
	}
	
	public double  generateSalarySlip()
	{
		System.out.println("Salary Slip Of Employee");
		return this.getSal();
	}
	
	public static List<Employee> getEmployees()
	{
		List<Employee> newList = new ArrayList<>();
		newList.add(new Employee(100, "Unnati",35000D, 10, "F"));
		newList.add(new Employee(104, "Sneha",25000D, 8, "F"));
		
		newList.add(new FullTimeEmployee(107,"Nikil",40000D, 5,"M"));
		newList.add(new FullTimeEmployee(101,"Kiran",33000D, 2,"M"));
		
		newList.add(new PartTimeEmployee(103,"Salma",15000D, 3,"M"));
		newList.add(new PartTimeEmployee(102,"Celine",20000D, 4,"F"));
		return newList;
		
	}

}
