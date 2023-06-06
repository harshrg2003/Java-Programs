package com.harsh;
import java.util.Scanner;
public class Calci {
       Scanner sc=new Scanner(System.in);
       int num1,num2,result;
       char op;
       
       Calci(int n,int m)
       {
    	   this.num1=n;
    	   this.num2=m;
       }
       public void setChoice()
       {
    	   System.out.println("Enter the choice");
    	   System.out.println("Press '+'for Addition,'-'for Subtraction,'*'for multiplication,'/'-Division ");
    	   this.op=sc.next().charAt(0);
       }
       public void performDesiredop(Calci c1)
       {
    	   switch(this.op)
    	   {
    	   case '+':this.result=c1.num1+c1.num2;
    	            System.out.println("Addition="+this.result);
    	            break;
    	   case '-':this.result=c1.num1-c1.num2;
                    System.out.println("Subtraction="+this.result);
                    break;
    	   case '*':this.result=c1.num1*c1.num2;
                    System.out.println("Product="+this.result);
                    break;
    	   case '/':if(c1.num2!=0)
    	   {
    		   this.result=c1.num1/c1.num2;
    		   System.out.println("Quotient="+this.result);
    		   break;
    	   }
    	   else
    	   {
    		   System.out.println("Division not possible");
    		   break;
    	   }
    	   default:System.out.println("Choice not Valid");
                    
    	   }
       }
       Calci(){}
}
