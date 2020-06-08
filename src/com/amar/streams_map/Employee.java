package com.amar.streams_map;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private Integer id;
	private String name ;
	private Double sal ;
	private Integer yearsInOrg ;
	public Employee(Integer id, String name, Double sal, Integer yearsInOrg) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.yearsInOrg = yearsInOrg;
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
	public final Double getSal() {
		return sal;
	}
	public final void setSal(Double sal) {
		this.sal = sal;
	}
	public final Integer getYearsInOrg() {
		return yearsInOrg;
	}
	public final void setYearsInOrg(Integer yearsInOrg) {
		this.yearsInOrg = yearsInOrg;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal
				+ ", yearsInOrg=" + yearsInOrg + "]";
	}
	
	public static List<Employee> getEmpList()
	{
		List<Employee> empList = new ArrayList<>();
		Employee e1 = new Employee(101, "Roger",15000D, 0);
		Employee e2 = new Employee(104, "Chris",25000D, 2);
		Employee e3 = new Employee(103 ,"Samuel",30000D, 0);
		Employee e4= new Employee(102, "Brian",10000D, 3);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		return empList;
	}

}
