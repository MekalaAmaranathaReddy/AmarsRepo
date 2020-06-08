package com.amar.genericDemo;

public class TestGeneric {
	
	public static <E> void printArray(E [] list)
	{
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[] arrInteger = {10,20,30,40,50,60};
        Character[] arrChar ={'I','N','F','O','S','Y','S'};
        Double[] arrDouble = {100.1,200.1,300.1,400.1,500.1,600.1};
        
        TestGeneric testGeneric = new TestGeneric();
        testGeneric.printArray(arrInteger);
        testGeneric.printArray(arrChar);
        testGeneric.printArray(arrDouble);
	}

}
