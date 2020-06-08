package com.amar.java8staticusage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> countryList = new ArrayList<>();
		countryList = Arrays.asList("India","Brazil","Arzentina");
		countryList.sort(Comparator.naturalOrder());
		
		for(String countryName :countryList)
		{
			System.out.println(countryName);
		}
		
		
		
	}

}
