package assignment2;

public class Commision {
	String name;
	String Address;
	float salesamount;
	Commision(String name,String Address,float salesamount){
		this.name=name;
		this. Address=Address;
		 this.salesamount=salesamount;
		
	}

	void members() {
		System.out.println(salesamount + "Commision");
	}

	
	if(salesamount>=100000) {
		System.out.println("Commisission=10%");
	}else if(50000<=salesamount<10000) {
		System.out.println("Commisission=5%");
	}else if(30000>=salesamount<50000) {
		System.out.println("Commisission=3");
	}else if(salesamount<30000){
		System.out.println("Commisission=no commision");
	}else {
		System.out.print(false);
	}
	
	class test{
		public static void main(String[] args) {
			Commision a1=new Commision("Rajesh","E.city",1000f);
			Commision a2=new Commision("Ramu","E.city II",50000f);
		a1.members();
		a2.members();
		}}
}

