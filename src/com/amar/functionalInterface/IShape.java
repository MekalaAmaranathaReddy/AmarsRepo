package com.amar.functionalInterface;

@FunctionalInterface
public interface IShape {
    //we should have only one abstract method in Functional Interface ,otherwise we will get compile time error .
	 void draw();
	// Double perimeter();//uncomment the abstract method to observe the difference .
	
	 
	 //we can have any number of default methods along with one abstarct method .
	  default Double area(Integer radius)
	{
		return radius*3.14 ;
	}
	public default double area(Double height,Double width)
	{
		return height*width ;
	}
	
	//we can have any number of static methods along with one abstract method . 
	 static void print()
	{
		System.out.println("Inside print");
	}
	
	
	
}
