package EqualsOperator;

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1=new String("HELLO");
 String s2=new String("HELLO");
 
 System.out.println("s1 and s2 are equal :"+(s1==s2));
 System.out.println("s1 and s2 are equal :"+(s1.equals(s2)));
 s1 = s2;
 System.out.println("s1 and s2 are equal :"+(s1==s2));
 
	}

}
