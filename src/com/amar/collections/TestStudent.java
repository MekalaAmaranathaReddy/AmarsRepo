package com.amar.collections;

import java.util.HashSet;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<DemoStudentHashSet> hashSet = new HashSet<>();
		hashSet.add(new DemoStudentHashSet("Amara",6003312));
		hashSet.add(new DemoStudentHashSet("Natha",6003313));
		hashSet.add(new DemoStudentHashSet("Reddy",6003314));
		hashSet.add(new DemoStudentHashSet("Amara",6003312));
		hashSet.add(new DemoStudentHashSet("Reddys",6003314));
		
		for(DemoStudentHashSet dhs  : hashSet)
		{
			System.out.println(dhs);
		}
		
		
	}

}
