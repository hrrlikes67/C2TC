package Exception;

public class TryCatchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("11");
System.out.println("Before divide");
try
{
	int x=1/0;
	System.out.println("After divide");
	}
catch(ArithmeticException ae)
{
	System.out.println("A number cannot be divided by zero");
}
System.out.println("22");

	}

}
