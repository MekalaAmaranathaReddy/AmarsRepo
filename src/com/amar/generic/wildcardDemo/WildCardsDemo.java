package com.amar.generic.wildcardDemo;

public class WildCardsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Record<Student> studentRecord = new Record<>();
		Student student = new Student(101,"Adam");
		
		Record<Dayscholar> daysCholarRecord = new Record<>();
		Dayscholar daysCholar = new Dayscholar(102, "Robert",10000f);
		
		studentRecord.add(student);
		studentRecord.display(studentRecord);
		
		daysCholarRecord.add(daysCholar);
		daysCholarRecord.display(daysCholarRecord);
		
		
		
	}

}
