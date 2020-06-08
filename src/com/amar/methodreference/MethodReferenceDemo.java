package com.amar.methodreference;

public class MethodReferenceDemo {
	//Example with user defined method demo for method reference concept for Lambda Expression .
	public static void methodDisplay()
	{
		System.out.println("Squircle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IShape shape = MethodReferenceDemo :: methodDisplay;
        shape.display();
	}

}
