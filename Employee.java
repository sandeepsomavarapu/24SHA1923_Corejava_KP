package com.kpmg.io;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empId;
	private String empName;
	private int empSal;
	private String designation;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, int empSal, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.designation = designation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
