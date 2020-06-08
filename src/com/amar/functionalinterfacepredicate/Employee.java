package com.amar.functionalinterfacepredicate;
//Example to demonstrate the Predicate functional interface.
public class Employee {
	private Integer empId;
	private String empName ;
	private String country ;
	public final Integer getEmpId() {
		return empId;
	}
	public final void setEmpId(Integer empId) {
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
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", country=" + country + "]";
	}
	public Employee(Integer empId, String empName, String country) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.country = country;
	}
	

}
