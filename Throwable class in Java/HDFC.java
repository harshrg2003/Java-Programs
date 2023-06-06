package com.Comparator;

public class HDFC {
  static void BankAcc(int age) throws MyAccount
  {
	  if(age>=18)
	  {
		  System.out.println("Congratulations dear Customer,your HDFC bank Account has been Sucssesfully created");
	  }
	  else
	  {
		  throw new MyAccount(age);
	  }
  }
}
