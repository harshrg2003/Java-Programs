package com.Comparator;

public class MyAccount extends Throwable {
  int age;
  MyAccount(int age)
  {
	  this.age=age;
  }
  public String toString()
  {
	  return("Age is "+age+" Which is less than 18.Hence Bank Account cannot be created\n");
  }
}
