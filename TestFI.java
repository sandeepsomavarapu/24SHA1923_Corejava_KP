package com.kpmg.java8;

@FunctionalInterface
interface Calculator {
	public abstract int caluculate(int a, int b);
}

@FunctionalInterface
interface StringOperations {
	public abstract int caluculate(String name);
}

@FunctionalInterface
interface StringOperations1 {
	public abstract String caluculate(String name);
}


interface Test {
	public default void m2() {

	}

	public static void m3() {

	}

	void m1();
	

}

class Testinterface implements Test {

	@Override
	public void m1() {

	}

	@Override
	public void m2() {

	}
}

public class TestFI {
	public static void main(String[] args) {
		Calculator calci = (a, b) -> a + b;
		System.out.println(calci.caluculate(12, 13));
		System.out.println(calci.caluculate(15, 19));
		Calculator calci1 = (a, b) -> a - b;
		System.out.println(calci1.caluculate(12, 6));

		StringOperations ops = name -> name.length();
		System.out.println(ops.caluculate("kpmg"));

		StringOperations1 ops1 = name -> name.toUpperCase();
		System.out.println(ops1.caluculate("kpmg"));
	}

}
