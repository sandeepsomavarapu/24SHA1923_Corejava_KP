package com.kpmg.oops;

class Calci {
	public void add(int a, int b, int c) {
		System.out.println("add of three int's : " + (a + b + c));
	}
	public void add(int a, int b) {
		System.out.println("add of two int's : " + (a + b));
	}
	public void add(float a, float b) {
		System.out.println("add of two float's : " + (a + b));
	}
	public void add(int a, float b) {
		System.out.println("add of int,float : " + (a + b));
	}
	public void add(float a, int b) {
		System.out.println("add of float,int : " + (a + b));
	}
}
public class MethodOverloadingEx {
	public static void main(String[] args) {
		Calci cal = new Calci();
		cal.add(12, 13);
		cal.add(21.3f, 34.5f);
		cal.add(12, 13, 14);
		cal.add(12, 15.23f);
		cal.add(22.12f, 908);
		cal.add('a', 'b');//type promotion
	}

}
