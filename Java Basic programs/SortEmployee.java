package com.harsh;
import java.util.Scanner;

class EmployeeInfo
{
	Scanner sc=new Scanner(System.in);
	String name;
	int experience;
	int empid;
	int salary;
	
	public void getData()
	{
		System.out.println("Enter Employee name:");
		name=sc.next();
		System.out.println("Enter employee ID:");
		empid=sc.nextInt();
		System.out.println("Enter the experience of employee:");
		experience=sc.nextInt();
		System.out.println("Enter the salary of employee:");
		salary=sc.nextInt();
	}
	public static void sort(EmployeeInfo a1[],int n)
	{
		EmployeeInfo temp=new EmployeeInfo();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a1[j].experience>a1[j+1].experience)
				{
					temp=a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;
				}
			}
		}
	}
	public void display()
	{
		System.out.println("Employee name:"+name);
		System.out.println("Employee ID:"+empid);
		System.out.println("Employee experience:"+experience);
		System.out.println("Employee Salary:"+salary);
		
	}
}

public class SortEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number of employees");
		n=sc.nextInt();
		EmployeeInfo a1[]=new EmployeeInfo[n];
		for(i=0;i<n;i++)
		{
			a1[i]=new EmployeeInfo();
		}
		for(i=0;i<n;i++)
		{
			a1[i].getData();
		}
		EmployeeInfo.sort(a1,n);
		for(i=0;i<n;i++)
		{
			a1[i].display();
		}
	}

}
