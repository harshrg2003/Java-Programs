package com.Comparator;

public class ICICI {
	 static void BankAcc(int age) throws MyAccount
	  {
		  if(age>=18)
		  {
			  System.out.println("Congratulations dear Customer,your ICICI bank Account has been Sucssesfully created");
		  }
		  else
		  {
			  throw new MyAccount(age);
		  }
	  }
	}

