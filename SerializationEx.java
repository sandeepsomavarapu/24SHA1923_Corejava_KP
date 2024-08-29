package com.kpmg.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {

		Employee emp = new Employee(123, "suresh", 12000, "developer");
		FileOutputStream out = new FileOutputStream("emps.txt");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(emp);
		
		System.out.println("Employee Object saved!!!");

	}

}
