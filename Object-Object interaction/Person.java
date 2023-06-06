package com.harshu;

public class Person {
       Elevator e=new Elevator();
        public void selecting()
        {
        	System.out.println("Selecting an option");
        	Entering(e);
        }
        public void Entering(Elevator E)
        {
        	E.open();
        	System.out.println("Entering the elevator");
        	E.travelling();
        	exit(E);
        }
        public void exit(Elevator E)
        {
        	System.out.println("Exiting Elevator");
        	E.close();
        }
}
