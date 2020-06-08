package com.amar.java8;

public class DefaultStarter  implements Greeting ,GreetingExtn {
	
	public static void main(String[] args)
	{
		DefaultStarter defaultStarter = new DefaultStarter();
		defaultStarter .hello();
	}

}
