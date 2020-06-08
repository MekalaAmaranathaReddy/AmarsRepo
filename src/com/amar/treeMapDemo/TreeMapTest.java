package com.amar.treeMapDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> gradeSet = new HashSet<>();
		
		DemoStudentHashSet std1 = new DemoStudentHashSet("Amara", 1001, 92);
		DemoStudentHashSet std2 = new DemoStudentHashSet("Natha", 1002, 51);
		DemoStudentHashSet std3 = new DemoStudentHashSet("Reddy", 1003, 32);
		
		gradeSet.add(std1.getGrade());
		gradeSet.add(std2.getGrade());
		gradeSet.add(std3.getGrade());
		
		TreeMap<Integer , String> studentGrade = new TreeMap<>();
		studentGrade.put(std3.getRollNumber(), std3.getGrade());
		studentGrade.put(std2.getRollNumber(),std2.getGrade());
		studentGrade.put(std1.getRollNumber(),std1.getGrade());
		
		Set<Integer> integers = studentGrade.keySet();
		for(Integer i : integers)
		{
			System.out.println("key: "+i+" Grade : "+studentGrade.get(i));
		}
		
		
		
	}

}
