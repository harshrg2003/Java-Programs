package com.harsh;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number of employees");
		n=sc.nextInt();
		Employee e1[]=new Employee[n];
		for(i=0; i<n;i++)
		{
			e1[i]=new Employee();
		     e1[i].getInfo();
		}
		for(i=0; i<n;i++)
		{	
		e1[i].displayInfo();
		}
       
	}

}
