package com.harsh;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		Calci c1=new Calci(a,b);
		Calci c2=new Calci();
		c2.setChoice();
		c2.performDesiredop(c1);

	}

}
