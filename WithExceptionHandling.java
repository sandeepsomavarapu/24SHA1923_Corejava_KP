package com.kpmg.exceptions;

import java.util.Scanner;

public class WithExceptionHandling {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number for division: ");
		int fnum = scan.nextInt();
		System.out.println("Enter Second number for division: ");
		int snum = scan.nextInt();
		try {
			int result = fnum / snum;
			System.out.println("Division of two numbers : " + result);
		} catch (ArithmeticException exception) {
			System.out.println("zero cannot be denominator ....");
		}
		System.out.println("Remaining 1000 lines of code ...");
	}

}
