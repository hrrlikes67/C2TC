package NoExceptionTryBlock;

public class finallyBlockExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=30,b=30;
try
{
	int sum=a+b;
	System.out.println("Sum:"+sum);
}
catch(Exception e)
{
	System.out.println(e);
}
finally
{
	System.out.println("finally block must be executed");
}
System.out.println("Hello java");
	}

}
