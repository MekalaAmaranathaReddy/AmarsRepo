package com.amar.generic.wildcardDemo;

public class Dayscholar extends Student{

	float stipend ;

	public Dayscholar(int id, String name,float stipend) {
		super(id, name);
		this.stipend = stipend ;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dayscholar [stipend=" + stipend + ", id=" + id + ", name="
				+ name + "]";
	}

	
	
	
}
