package com.amar.supplierfunctonalinterface;

public class PartTimeEmployee extends Employee{

	public PartTimeEmployee(int empId ,String empName,double salary,int exp,String gender)
	{
		super(empId,empName,salary,exp,gender);
	}
	
	public double generateSalarySlip()
	{
		System.out.println("Salary Slip Of PartTime Employee");
		return super.getSal()*1.10; // 10% increment
	}
}
