package com.kpmg.oops;

import java.util.Date;

public class ConstructorTest {

	public ConstructorTest() {
		System.out.println("Default Constructor");
	}
	public ConstructorTest(String name) {
		System.out.println("Param Constructor "+name);
	}
	public void displayDate() {
		System.out.println("Today's Date : " + new Date());
	}

	public static void main(String[] args) {
		ConstructorTest obj = new ConstructorTest("KPMG");
		obj.displayDate();
		ConstructorTest obj1 = new ConstructorTest();

	}

}
