package com.harsh;
import java.util.Scanner;

class Add
{
	int x,y,sum;
	Add(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int display(Add a1)
	{
		this.sum=a1.x+a1.y;
		return (this.sum);
	}
	
	Add(){}
}
public class demo {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		Add a1=new Add(num1,num2);
		Add a2=new Add();
		int res=a2.display(a1);
		System.out.println("The Sum of the two numbers x and y is "+res);
		sc.close();
	}

}
