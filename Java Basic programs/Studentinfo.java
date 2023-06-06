package com.harsh;
import java.util.Scanner;
public class Studentinfo {
     String name;
     int usn;
     String branch;
     int year;
     
     Studentinfo(){}
     public void setData()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter name");
    	 name=sc.next();
    	 System.out.println("Enter USN");
    	 usn=sc.nextInt();
    	 System.out.println("Enter the branch:");
    	 branch=sc.next();
    	 System.out.println("Enter the year");
    	 year=sc.nextInt();
     }
     
     public void displayData()
     {
    	 System.out.println("Displaying information of Student");
    	 System.out.println("\nStudent Name: "+name);
    	 System.out.println("\nStudent USN:"+usn);
    	 System.out.println("\nStudent branch:"+branch);
    	 System.out.println("\nStudent Year:"+year);
    	 
     }
}
