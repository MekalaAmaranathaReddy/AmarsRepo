package com.amar.java8staticusage;

public interface Remunerator {
	public abstract double deductFoodFee();
	
	final double HEALTH_INSURANCE_PERCENTAGE = 5.0 ;
	final double PENSION_PERCENTAGE = 5.0 ;
	
	public default double deductHealthInsurancePremium(double employeeSalary)
	{
		return (employeeSalary * HEALTH_INSURANCE_PERCENTAGE/100);
	}
	
    public static double deductForPension(double employeeSalary)
    {
    	return(employeeSalary * PENSION_PERCENTAGE /100);
    }
}
