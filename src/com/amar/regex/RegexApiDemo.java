package com.amar.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean isValid = validateNumber("7896541230");
		boolean isValid = validateNumber("789-65-41230");
		System.out.println("the given number is "+isValid);

	}
	
	public static boolean validateNumber(String ssnNmber)
	{
		
		String regEx = "\\d{3}-\\d{2}-\\d{5}";
		
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(ssnNmber);
		return matcher.matches();
		
	}

}
