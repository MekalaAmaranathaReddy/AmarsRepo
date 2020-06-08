package com.amar.java8;

public interface GreetingExtn extends Greeting{

	
	public default void hello()
	{
		System.out.println("hello from GreetingExtn");
	}
}
