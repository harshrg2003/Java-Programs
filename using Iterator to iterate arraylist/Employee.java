package com.Comparator;
import java.util.Scanner;
public class Employee {
   private int id;
   private float sal;
   private String name;
   private static Scanner in=new Scanner(System.in);
   public Employee()
   {
	   id=0;
	   sal=0;
	   name="";
   }
   public void getData()
   {
	   System.out.println("Enter name,ID and Salary");
	   name=in.nextLine();
	   id=in.nextInt();
	   sal=in.nextFloat();
   }
   public void show()
   {
	   System.out.println("Name:"+name+"\nID:"+id+"\nSalary"+sal);
   }
   public String toString()
   {
	   return ("Name:"+name+"\nID:"+id+"\nSalary:"+sal);
   }
}
