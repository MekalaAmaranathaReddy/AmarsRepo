package com.amar.generic.wildcardDemo;

import java.util.ArrayList;
import java.util.List;

public class Record<E> {
	
	List<E> list = new ArrayList<E>();
	
	public void add(E e)
	{
		list.add(e);
	}
	
	public void display(Record<? extends Student> record)
	{
		System.out.println(" Student Record " +record);
	}

	@Override
	public String toString() {
		return "Record [list=" + list + "]";
	}

}
