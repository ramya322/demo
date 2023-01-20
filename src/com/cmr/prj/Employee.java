package com.cmr.prj;

public class Employee {
	// Step 1: Read the data from HTML Page
	
	int empid;// reading an integer value from text box
	String ename ; //text box
	String empdesignation;
	public Employee(int empid, String ename, String empdesignation) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.empdesignation = empdesignation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", empdesignation=" + empdesignation + "]";
	}
	
	
	
    
}
