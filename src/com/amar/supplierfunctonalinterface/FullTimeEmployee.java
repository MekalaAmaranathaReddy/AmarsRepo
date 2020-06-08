package com.amar.supplierfunctonalinterface;

public class FullTimeEmployee extends Employee {
	
	public FullTimeEmployee(int empId ,String empName ,double sal ,int exp ,String gender)
	{
		super(empId,empName,sal,exp,gender);
	}
	
	public double generateSalarySlip()
	{
		System.out.println("Salary Slip Of FullTime Employee");
		return super.getSal()*1.20;  // 20% increment
		
	}

}
