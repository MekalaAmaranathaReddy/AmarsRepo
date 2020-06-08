package com.amar.java8staticusage;

public class Customer implements Deduction {
	
	public static void deduct()
	{
		System.out.println("Customer class Impl class deduct method");
		
	}
// Super class and subclass can both have the same static method names with same signature but this is not related to method overriding .Rather it is called as Mehtod Hiding Concept .
//Hence Overriding concept is not applicable for static methods .
	//We can overload the static methods as regular baasis as for normal methods .
	
	//Runtime Polymorphysm is not applicable to the static methods .
	//Compile time polymorphysm is also not applicable to the satic methods .
	
	
 }
