package com.kpmg.oops;

class Caluculator {

	public void add(int a, int b) {
		System.out.println("add of two numbers is : " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("sub of two numbers is : " + (a - b));
	}

	public void mul(int a, int b) {
		System.out.println("mul of two numbers is : " + (a * b));
	}
}

class MobileCalci extends Caluculator {
	public void div(int a, int b) {
		System.out.println("div of two numbers is : " + (a / b));
	}
}

class LaptopCalci extends Caluculator {
	public void mod(int a, int b) {
		System.out.println("mod of two numbers is : " + (a % b));
	}
}
public class InheritanceTest {
	public static void main(String[] args) {
		LaptopCalci obj = new LaptopCalci();
		obj.add(12, 14);// code re usability
		obj.sub(12, 14);
		obj.mul(12, 14);
		//obj.div(12, 2);//this is not allowed in hirarchie  
		obj.mod(12, 9);
	}
}
