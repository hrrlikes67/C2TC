package Assignments;

public class state {
	public void print_state(){
		System.out.println("state= Karnataka");
	}

}
class city extends state{
	public void print_city() {
		System.out.println("city=Bangalore");
	}
}
class district extends city{
	public void print_district() {
		System.out.println("district=Bangalore rural");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		district ob=new district();
		ob.print_state();
		ob.print_city();
		ob.print_district();
	}

}
