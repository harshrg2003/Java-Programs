package com.Comparator;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeArrayList {
  public ArrayList<Employee> getlist()
  {
	  Employee E1=new Employee();
	  E1.getData();
	  ArrayList<Employee>al=new ArrayList<Employee>();
	  al.add(E1);
	  return al;
  }
  public void display(ArrayList<Employee> al)
  {
	  Iterator<Employee>it=al.iterator();
	  while(it.hasNext()==true)
	  {
		  System.out.println(it.next());
	  }
  }
}
