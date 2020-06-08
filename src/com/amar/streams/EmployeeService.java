package com.amar.streams;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Employee> lstEmp = Employee.getEmployeeList();
       
       //Converting a list into Stream
       Stream<Employee> empStream = lstEmp.stream();
       //printing the stream
       System.out.println("*********printing the stream**********");
       empStream.forEach(System.out::println);
       
       Stream<Employee> empStream_filter = lstEmp.stream();
       //Filtering based on Employees time in the organization
       System.out.println("********filtering the Stream**********");
      // Stream<Employee> filterEmpStream = empStream.filter((emp)->emp.getYearsInOrg()<1) ;
       //In the above line we get Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed.
       //Because Streams are one time usage purpose like iterators.Once these are closed we cant operate with those streams.
      Stream<Employee> filterEmpStream = empStream_filter.filter((emp)->emp.getYearsInOrg()<1) ;
       filterEmpStream.forEach(System.out::println);
       
       Stream<Employee> empStream_sort = lstEmp.stream();
       System.out.println("********Sorting the Stream");
       //Sorting baased on Employee Id
       Stream<Employee> sortedEmpStream = empStream_sort.sorted((emp1,emp2)->emp1.getId()- emp2.getId());
       sortedEmpStream.forEach(System.out::println);
       
       Stream<Employee> empStream_Pipeline = lstEmp.stream();
       //Pipelining all the streams into one
       System.out.println("********Pipelining all the functionalities");
       empStream_Pipeline.filter((emp)->emp.getYearsInOrg()< 1).sorted((e1,e2)->e1.getId()-e2.getId()).forEach((e)->System.out.println(e.getId()+" : "+e.getName()));
       
}
}
