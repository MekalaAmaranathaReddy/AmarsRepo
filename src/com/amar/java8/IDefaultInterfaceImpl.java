package com.amar.java8;

public class IDefaultInterfaceImpl  implements IDefaultInterface{

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return null;
	}
	 @Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		IDefaultInterface.super.defaultMethod();
		System.out.println("In Implementing class implementation");
	}
	 
	 public static void main(String[] args)
	 {
		 IDefaultInterfaceImpl defaultImplementation = new IDefaultInterfaceImpl();
		 defaultImplementation.defaultMethod();
	 }

}
