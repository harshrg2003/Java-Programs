package com.Add;
import java.util.Scanner;
public class Employee {
	Scanner sc=new Scanner(System.in);
   String Ename;
   int Eid;
   int experience;
   float Salary;
    public void getData()
    {
    	System.out.println("Enter the name of the Employee");
    	Ename=sc.next();
    	System.out.println("Enter the name of the Employee");
    	Eid=sc.nextInt();
    	System.out.println("Enter the name of the Employee");
    	experience=sc.nextInt();
    	System.out.println("Enter the name of the Employee");
    	Salary=sc.nextFloat();
    	
    }
}
