package com.kpmg.oops;

import java.util.Date;

interface Animal {
	int age = 12;// public static final int age=12;

	public void animalSound(); // public abstract void animalSound()

	public void run(); // interface method (does not have a body)
}

class Dog implements Animal {

	@Override
	public void animalSound() {
		System.out.println("Bow Bow");
	}

	@Override
	public void run() {
		System.out.println("10km per hour");
	}

}

abstract class Parent {

	public abstract void add(int a, int b);

	public void sub(int a, int b) {
		System.out.println("Sub of two numbers :" + (a - b));
	}

}

public class AbstractionTest extends Parent {

	public void printDate() {
		System.out.println("Today's Date :" + new Date());
	}

	public void printMsg() {
		System.out.println("Hello ! Am from india");
	}

	public static void main(String[] args) {
		AbstractionTest obj = new AbstractionTest();
		obj.printDate();
		obj.printMsg();

	}

	@Override
	public void add(int a, int b) {
		System.out.println("implemented in child");
	}
}
