package com.src.assignment;
import java.util.Scanner;
public class Assignment_tempreature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int temperature=sc.nextInt();;
		int week=5;
		for(int i=1;i<week;i++) {
			temperature=temperature-2;
			System.out.println(temperature);
		}
	}

}
