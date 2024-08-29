package com.kpmg.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperations {
	public static void main(String[] args) throws IOException {

		File file = new File("IODemo.txt");
		file.createNewFile();
		file.setReadable(false);
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getUsableSpace());
		System.out.println(file.lastModified());
		System.out.println(file.length());

		File file1 = new File("sample");
		file1.mkdir();
		System.out.println(file1.isDirectory());

//		PrintWriter out=new PrintWriter("demo.txt");
//			out.println("welcome to india");
//			out.println(123);
//			out.println(true);
//			out.flush();

		BufferedReader reader = new BufferedReader(new FileReader("demo.txt"));

		String data = reader.readLine();

		while (data != null) {
			System.out.println(data);
			data=reader.readLine();
		}

	}
}
