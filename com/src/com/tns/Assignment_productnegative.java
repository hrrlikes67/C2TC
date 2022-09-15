package com.tns;
import java.util.Scanner;
public class Assignment_productnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int negatives=1;
	      int  num [] = {1,2,3,4,5,6,7,-8,-9,12};

	      for(int i=0;i<num.length;i++)
	         {
	               if (num[i]<0)
	               {
	                  negatives*=num[i];
	               }
	               
	         }

	         System.out.println("The product of negatives is " + negatives);
	}

}
