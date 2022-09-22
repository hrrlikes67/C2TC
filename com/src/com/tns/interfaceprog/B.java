package com.tns.interfaceprog;
interface A
{
	void msg();
}
public class B implements A  {
public void msg ()
{
	System.out.println("Hello Java");
}
void show()
{
	System.out.println("Welcome you");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new B();
b.msg();
b.show();
A a=new B();
a.msg();
	}

}
