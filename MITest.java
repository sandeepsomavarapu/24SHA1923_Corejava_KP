package com.kpmg.oops;

interface Parent1 {
	void m1();

}

interface Parent2 {
	void m1();

}

public class MITest implements Parent1, Parent2 {
	public static void main(String[] args) {
		MITest obj = new MITest();
		obj.m1();
	}

	@Override
	public void m1() {
		System.out.println("Child Implementation");
	}
}
