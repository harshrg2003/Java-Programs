package com.harsh;
import java.util.Scanner;
public class Checkprimenumber {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		Prime p1=new Prime(n);
		int chk_prime=p1.checkprime();
		if(chk_prime==0)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");

	}

}
