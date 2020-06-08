package com.amar.consumerfunctionalinterface;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private Integer id ;
	private String name ;
	private String role ;
	private Double sal ;
	public Employee(Integer id, String name, String role, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.sal = sal;
	}
	public final Integer getId() {
		return id;
	}
	public final void setId(Integer id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getRole() {
		return role;
	}
	public final void setRole(String role) {
		this.role = role;
	}
	public final Double getSal() {
		return sal;
	}
	public final void setSal(Double sal) {
		this.sal = sal;
	}
	
	public static List<Employee> getEmpList()
	{
		Employee e1 = new Employee(101, "Aron", "Sr System Engineer", 25000D);
		Employee e2 = new Employee(102, "Cindia", " System Engineer", 20000D);
		Employee e3 = new Employee(103, "Zindane", "Technology Lead", 35000D);
		Employee e4 = new Employee(104, "Emilla", "Technology Architect", 40000D);
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		return empList ;
	}

}
