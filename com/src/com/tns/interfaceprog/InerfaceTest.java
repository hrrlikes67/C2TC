package com.tns.interfaceprog;

public class InerfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a; // Creating interface reference.
	    a = new Circle(); // Creating object of circle.
	    float circle = a.caluclateArea(20, 10.5f);
	    System.out.println("Area of circle: " +circle);
	     
	    a = new Square(); // Creating object of square.
	    float square = a.caluclateArea(20.5f, 10.5f);
	    System.out.println("Area of square: " +square);
	}

}
