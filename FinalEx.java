package com.kpmg.oops;

class Person1 {// we cannot inherit final classes
	int age = 12;// we cannot modify final variable value

	public void updateAge() {// we cannot override final method
		++age;
		System.out.println("age is :" + age);
	}

	public void m1() {
		System.out.println("am from m1 method of person class");
	}
}

public class FinalEx extends Person1 {

	public static void main(String[] args) {
		FinalEx obj = new FinalEx();
		obj.updateAge();
		obj.m1();
	}

	@Override
	public void updateAge() {
		--age;
		System.out.println("update age is :" + age);
	}
}
