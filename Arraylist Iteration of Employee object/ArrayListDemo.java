package com.Add;
import java.util.*;
public class ArrayListDemo {
   public static ArrayList<Employee> getList()
   {
	   Employee e1=new Employee();
	   Employee e2=new Employee();
	   ArrayList<Employee> al=new ArrayList<Employee>();
	   al.add(e1);
	   al.add(e2);
	   return al;
   }
   public void display(ArrayList<Employee> al)
   {
	   Iterator<Employee> it=al.iterator();
	   while(it.hasNext()==true)
	   {
		   System.out.println(it.next());
	   }
   }
}
