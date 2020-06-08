package com.amar.optional_classes;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public class Employee {
  private String name ;
  private Integer id ;
  private Double sal ;
  
  Optional<Passport> passport = Optional.empty();
  
  public Employee()
  {
	  //No logic
  }

public Employee(String name, Integer id, Double sal, Optional<Passport> passport) {
	super();
	this.name = name;
	this.id = id;
	this.sal = sal;
	this.passport = passport;
}
public final String getName() {
	return name;
}
public final void setName(String name) {
	this.name = name;
}
public final Integer getId() {
	return id;
}
public final void setId(Integer id) {
	this.id = id;
}
public final Double getSal() {
	return sal;
}
public final Optional<Passport> getPassport() {
	return passport;
}
public final void setPassport(Optional<Passport> passport) {
	this.passport = passport;
}
public final void setSal(Double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + "]";
}
  public static List<Employee> getEmpList() 
  {
	List<Employee> employeeList =new ArrayList<>();
	//creating Employee Objects with passport
	Optional<Passport> p1 = Optional.of(new Passport(10121));
	/*Optional value = Optional.of(10);
	boolean result = value.isPresent();*/
	Employee e1 = new Employee("Robert",102,10000D, p1);
	Optional obj = Optional.empty();
	
	Optional<Passport> p2 = Optional.of(new Passport(10122));
	Employee e2 = new Employee("James",105,15000D, p2);
	
	//Creating Employee objects without Passport
	
	Employee e3 = new Employee();
	e3.setId(107);
	e3.setName("Tyrion");
	e3.setSal(21000D);
	
	Employee e4 = new Employee();
	e4.setId(110);
	e4.setName("Bruce");
	e4.setSal(8000D);
	
	employeeList.add(e1);
	employeeList.add(e2);
	employeeList.add(e3);
	employeeList.add(e4);
	
	
	
	
	return 	employeeList;
	
	
	
  }
}

//unrelated code for the above class.
/*String uuid = UUID.randomUUID().toString();
URL url = null;
InputStream in = url.openConnection().getInputStream();
Files.copy(in, Paths.get(uuid+".txt"),StandardCopyOption.REPLACE_EXISTING);*/






