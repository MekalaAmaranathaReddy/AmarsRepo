package com.amar.traversalofCollectionsUsingLambda;

import java.util.Arrays;
import java.util.List;

public class CountryCaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		List<String> listCountries = Arrays.asList("France","Germany","Italy","Egypt");
		listCountries.sort((s1,s2)->s1.compareTo(s2));
		//The above line can also be written as below
		//listCountries.sort((String s1,String s2)->s1.compareTo(s2));
		
		listCountries.forEach((String s)->System.out.println(s));
		//we can directly write as follows
		//listCountries.forEach((s)->System.out.println(s));
	}

}
