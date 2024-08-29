package com.kpmg.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("emps.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp=(Employee) ois.readObject();
		System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpSal());
		
	}
}
