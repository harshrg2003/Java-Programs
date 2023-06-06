package inherit;
import java.util.Scanner;
public class Comrades extends Friend {
	Scanner sc=new Scanner(System.in);
   String name;
   int age;
   String adress;
   long phonenumber;
     public void getData()
     {
    	 super.getData();
    	 System.out.println("Enter your name");
    	 name=sc.next();
    	 System.out.println("Enter your age");
    	 age=sc.nextInt();
    	 System.out.println("Enter your adress");
    	 adress=sc.next();
    	 System.out.println("Enter your phonenumber");
    	 phonenumber=sc.nextLong();
    	 
     }
     public void displayData()
     {
    	 super.displayData();
    	 System.out.println("Name of ur best freind "+name);
    	 System.out.println("His age "+age);
    	 System.out.println("The adress of my close friend is "+adress);
    	 System.out.println("His phonenumber is "+phonenumber);
    	 System.out.println("Thank you for helping me so much,let sus continue to help each other");
    	 
     }
     public void A()
     {
    	 System.out.println("Hello!Harsh");
     }
}
