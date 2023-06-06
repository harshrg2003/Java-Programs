package com.harshrg;

public class Main {

	public static void main(String[] args) {
		Teacher t=new Teacher("KiranSIR",48,"Male","Phd.","CSE",25);
		Student s=new Student("Adarsh",19,"Male",011,"CSE",3);
		System.out.println("Teacher Information\n");
		t.display();
		System.out.println("Student Information\n");
        s.display();
	}

}
