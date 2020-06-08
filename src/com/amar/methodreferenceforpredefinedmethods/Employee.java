package com.amar.methodreferenceforpredefinedmethods;

public class Employee {
	//Example with predefined method for method reference concept
	private Integer empId ;
	private String empName ;
	private String country ;
	public Employee(Integer empId, String empName, String country) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.country = country;
	}
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
	
    public static int compareByCountry(Employee employee1 ,Employee employee2)
    {
    	return employee1.getCountry().compareTo(employee2.getCountry());
    }
}
