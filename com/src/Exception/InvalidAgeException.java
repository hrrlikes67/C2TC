package Exception;

import java.util.Scanner;
public class InvalidAgeException extends Exception  {
	//Declare a parameterized exception with string str as a parameter.

	InvalidAgeException(String str)
	{
		super(str);
	}
private static int age;
static void validate()throws InvalidAgeException 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	age=sc.nextInt();
	if(age<18)
		throw new InvalidAgeException ("invalid Age,you are not eligble to vote");
	else
		System.out.println("Welcome to vote");
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
