package assignment.Try.staticthings;

public class staticmethod {
	static int x = 20;
	int y = 30;
	
	
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	
	static void show()
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticmethod st = new staticmethod();

	
		    st.display();

		
		   staticmethod.show();
	}

}
