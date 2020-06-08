package com.amar.functionalInterface;

public class IShapeTester implements IShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         IShape.print();
         //Double area = area(21);
         
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("dummy implementation");
		Double radius = area(21);
		System.out.println(radius);
	}
	

}
