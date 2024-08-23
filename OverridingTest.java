package com.kpmg.oops;

class Person {
	int age = 12;

	public void updateAge() {
		++age;
		System.out.println("age is :" + age);
	}

	public void m1() {
		System.out.println("am from m1 method of person class");
	}
}

public class OverridingTest extends Person {

	public static void main(String[] args) {
		OverridingTest obj = new OverridingTest();
		obj.updateAge();
		obj.m1();
	}
	@Override
	public void updateAge() {
		--age;
		System.out.println("update age is :" + age);
	}
}
