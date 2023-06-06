package com.harsh;
import java.util.Scanner;
public class Studentbasicsinfo {
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  int n,i;
    	  System.out.println("Enter the number of Students");
    	  n=sc.nextInt();
    	  Studentinfo s1[]=new Studentinfo[n];
    	  for(i=0;i<n;i++)
    	  {
    		  s1[i]=new Studentinfo();
    		  s1[i].setData();
    	  }
    	  for(i=0;i<n;i++)
    	  {
    		  s1[i].displayData();
    	  }
      }
}
