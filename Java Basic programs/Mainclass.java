package com.harsh;

public class Mainclass {

	public static void main(String[] args) {
		Room rectangle=new Room(20.8,10.9);
		Room square=new Room(20.4);
		rectangle.calcArea();
		rectangle.calcArea(10.32);
		rectangle.displayArea();
		square.calcArea();
		square.calcArea(10.00);
        square.displayArea();
	}

}
