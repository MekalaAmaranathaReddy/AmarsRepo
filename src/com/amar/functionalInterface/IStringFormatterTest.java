package com.amar.functionalInterface;

public class IStringFormatterTest  {

	static String s1 = "Lambda" ;
	static String s2 = "Expression" ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*IStringFormatter formatter = (s1,s2) -> s1+" "+s2;
		System.out.println(formatter.format(s1, s2));*/
		
		/*IStringFormatter formatter = (String s1,String s2)->{
		
			String temp = s1+"-"+s2;
			return temp ;
		};
		System.out.println(formatter.format(s1, s2));*/
		
		IStringFormatter formatter = (String s1,String s2)->{
			String temp = s1.toUpperCase()+" "+s2.toUpperCase();
			return temp ;
		};
		
		System.out.println(formatter.format(s1, s2));
	}

}
