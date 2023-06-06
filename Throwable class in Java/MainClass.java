package com.Comparator;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age for the creation of your bank Account\n");
		int age=sc.nextInt();
		
		try
		{
			System.out.println("Enter the choice whether an ICICI bank acount to be created or HDFC");
			System.out.println("Enter your choice dear Customer");
			int choice=sc.nextInt();
			switch(choice)
			{
			   case 1:HDFC.BankAcc(age);
			          break;
			   case 2:ICICI.BankAcc(age);
			          break;
			}
		}
		catch(MyAccount a)
		{
			a.printStackTrace();
		}
	}

}
