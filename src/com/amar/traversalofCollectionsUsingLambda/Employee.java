package com.amar.traversalofCollectionsUsingLambda;

public class Employee {
	private int empId;
	private String empName ;
	private String country ;
	public Employee(int empId, String empName, String country) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.country = country;
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
	public final String getCountry() {
		return country;
	}
	public final void setCountry(String country) {
		this.country = country;
	}
	

}
