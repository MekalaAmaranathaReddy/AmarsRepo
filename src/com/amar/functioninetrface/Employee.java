package com.amar.functioninetrface;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private Integer empId ;
	private String empName ;
	private double sal ;
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
	public final double getSal() {
		return sal;
	}
	public Employee(Integer empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	public final void setSal(double sal) {
		this.sal = sal;
	}
	
	public static List<Employee> getEmployeeList()
	{
		Employee e1 = new Employee(101, "Aron", 50000D);
		Employee e2 = new Employee(102, "Cindia", 30000D);
		Employee e3 = new Employee(103, "Zindane", 45000D);
		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		return empList ;
	}


/*public Integer getEmpId()
{
	return this.empId ;
}
public void setEmpId(Integer empId)
{
	this.empId = empId ;
}*/
}