package com.amar.java8;

public interface IDefaultInterface {
	
	default void defaultMethod()
	{
		System.out.println("In default Implementation method");
	}
	
	public abstract  String hello();

}
