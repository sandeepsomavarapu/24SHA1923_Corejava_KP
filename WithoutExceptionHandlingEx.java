package com.kpmg.exceptions;

import java.util.Scanner;

public class WithoutExceptionHandlingEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number for division: ");
		int fnum = scan.nextInt();
		System.out.println("Enter Second number for division: ");
		int snum = scan.nextInt();
		int result = fnum / snum;
		System.out.println("Division of two numbers : "+result);
		System.out.println("Remaining 1000 lines of code ...");
	}

}
