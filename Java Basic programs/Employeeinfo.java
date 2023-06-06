package com.harsh;
import java.util.Scanner;

class Employee
{
	
	String name;
	
	float salary;
	int empid;
	int experience;
	
	public Employee() {}
	public void getInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the information of employee");
		System.out.println("Enter name");
		name=sc.next();
		
		System.out.println("Enter salary");
		salary=sc.nextFloat();
		
		System.out.println("Enter Employee ID");
		empid=sc.nextInt();
		System.out.println("Enter number of years of experience");
		experience=sc.nextInt();
		
		
	}
	public void displayInfo()
	{
		System.out.println("Display the information of the employee");
	System.out.println("\nName: "+name+"\n Salary: "+salary+"\n Employee ID: "+empid);
		System.out.println("\nYears of experience: "+experience);
	}
}

