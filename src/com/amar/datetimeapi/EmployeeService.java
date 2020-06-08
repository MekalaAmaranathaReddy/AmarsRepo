package com.amar.datetimeapi;

import java.util.Date;

public class EmployeeService {

	private int id ;
	private String name ;
	private Date joinedDate ;
	public EmployeeService(int id, String name, Date joinedDate) {
		super();
		this.id = id;
		this.name = name;
		this.joinedDate = joinedDate;
	}
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final Date getJoinedDate() {
		return joinedDate;
	}
	public final void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public final void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		String result = "Employee Service[Id : "+this.id+" , name :  "+this.name+" , joined date : "+this.joinedDate;
		return result ;
	}
	
	
	
}
