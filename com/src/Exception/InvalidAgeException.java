package Exception;

import java.util.Scanner;

public class InvalidAgeException extends Exception  {
private static String age;
static void validate()throws InvalidAgeException 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	age=sc.next int();
	if(age<18)
		throw new InvalidAgeException ("invalid age,you are not eligble to vote");
	else
		System.out.println("welcome to vote");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	validate();
}
catch(Exception e)
{
	System.out.println("Caught an Exception:\n"+e);
}
	}

}
