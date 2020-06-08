package com.amar.java8;

public interface Greeting {

	default void hello()
	{
		System.out.println("hello from Greeting");
	}
	
}
