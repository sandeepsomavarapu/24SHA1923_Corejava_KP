package com.kpmg.java8;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFi {
	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i % 2 == 0;
		System.out.println(predicate.test(11));

		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(20));

		String s = "welcome";
		Function<String, String> f1 = i -> i.toUpperCase();
		System.out.println(f1.apply(s));
		
		Consumer<String> c = s1 -> System.out.println(s1); 
		c.accept("I consume data but don't return anything"); 
		
		Supplier<String> otps = () -> {
		     String otp = "";
		     for (int i = 1; i <= 6; i++) {
		        otp = otp + (int) (Math.random() * 10);
		     }
		   return otp;
		};
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		
		Supplier<Integer> supplier = () -> new Random().nextInt(100);
	    System.out.println(supplier.get());
	}
}
