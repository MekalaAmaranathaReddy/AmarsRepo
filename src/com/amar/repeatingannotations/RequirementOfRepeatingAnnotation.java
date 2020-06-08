package com.amar.repeatingannotations;

public class RequirementOfRepeatingAnnotation {
	
	//Techsol has dcided to makethe details about developers to be transparent at project level.
	//The deails should include the author name and method name that has been ceated or modified by the author .
	//In additon these details need to be includded at code level .
	//This will allow easy coardination of the project members(in case of queries pertaining to a particular method ,the author of that method coul be eached ut directly)
	//To begin with this an annotation has been created to keep a record of developer names and the methods they have worked on .
	//@Target({ElementType.Type})//can be applied at class level or interface level or enum level
	
	//public  @nterface Author {
	//String name();
	//String method() ;
    //  }	
	
	//The code that use the Author annotation
	//public class FullTimeEmployee extends Employee
	
	//{
	//public double calculateSalary()
	//{
	//salary calculation for full time employee
	//}
	//public double deductFoodFee()
	//{
	//Food Fee deduction from salary
	//}
	//public double deductHealthInsurancePremium()
	//{
	//return (HEALTH_INSURANCE_PERCENTAGE*employesalary)/100
//The problem here is easily noticeable -there is no clear indication about who has workd on which mehod ,so here confusion will be created among the developers.
	
}
