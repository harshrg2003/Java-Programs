package com.Comparator;
import java.util.Scanner;
public class Laptop {
	Scanner sc=new Scanner(System.in);
  String brand;
  int cost;
  int RAMsize;
  public void getData(Laptop a[])
  {
	  System.out.println("Enter the Brand\n");
	  this.brand=sc.next();
	  this.cost=sc.nextInt();
	  this.RAMsize=sc.nextInt();
  }
  public int compareTo(Laptop a[],int n)
  {
	  for(int i=0;i<n;i++)
	  {
		  if(this.cost>a[i].cost)
			  return 1;
		  else
			  return -1;
	  }
	return 0;
  }
  public String toString()
  {
	  return "Brand of the Laptop"+brand+"Cost of Laptop"+cost+"RAM= "+RAMsize;
  }
}
