package com.harshrg;
import java.util.Scanner;
//Program which adds the value stored at both the specified indexes of the array 
// if no Array out of bound exception occurs else addition of two values at the indexes not possible even if one 
//of the index is out of bounds 
public class ExceotionsHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array\n");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the elements of the Array one by one\n");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Specific Index");
		int index=sc.nextInt();
		try
		{
			System.out.println("The value stored at that index is "+arr[index]);
			System.out.println("Enter another Index");
			int index2=sc.nextInt();
			System.out.println("The value stored at that index is "+arr[index2]);
			System.out.println("Add the two index values");
			int sumOftwoindex=arr[index]+arr[index2];
			System.out.println("The sum of the values of the two index is "+sumOftwoindex);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The index value you have entered is out of bounds ,hence value not displayed");
			System.out.println(e);
			System.out.println("Error!Cound't add the values,due to the above displayed Exception");
		}
		
		

	}

}
