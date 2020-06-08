package com.amar.needOfLambdaExpressionUsingFunctionalInterface;

public class DemoThreadmine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //with ananymous inner class
		/*Thread myInstance = new Thread(new Runnable()
		{
			public void run()
			{
				System.out.println("Its me from Thread");
			}
		});*/
		
		//Replacing the above code with Functional interface
		
		Thread myInstance = new Thread(() ->System.out.println("Its me from Thread"));
		
		myInstance.start();
	}

}
