package com.tns.interfaceprog;

public class Prime implements Accounts {

	public void deliverycharges() {
	System.out.println("No delivery charges for prime");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Prime p=new Prime();
Non_prime NP=new Non_prime();
p.deliverycharges();
NP.deliverycharges();
	}

}
