package com.tns.interfaceprog;

public class Circle implements Area {

	public float calculateArea(float x, float y)
	  {
	    float areaOfCircle = pi * x * y; // Implementation.
	    return areaOfCircle;
	  }
}
