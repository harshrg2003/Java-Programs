package com.Comparator;

public class MyException extends Throwable {
  int a;
  int b;
  MyException(int a,int b)
  {
	  this.a=a;
	  this.b=b;
	  
  }
  public String toString()
  {
	  return ("The value of b is "+b+"is negetive number");
  }
}
