package inheritence;


class withdraw
{
	int amt_withdraw = 3000;
}

public class inheritence extends withdraw 
{
	
	int amt_left = 6000;
	public static void main(String[] args)
	{
		inheritence ob1 = new inheritence ();
		System.out.println("Amount withdraw: "+ ob1.amt_withdraw);
	}
}
