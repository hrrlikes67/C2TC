package AssignmentsState;

public class state_prog {
	public void print_state() {
		System.out.println("state=KA");
	}
	}
class city extends state_prog{
	public void print_city() {
		System.out.println("city=BLR");
	}
}
class district extends city{
	public void print_district() {
		System.out.println("district=BLR rural");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
district ob=new district();
ob.print_state();
ob.print_city();
ob.print_district();
	}

}
