package com.Oops;

public class Employee {
	private String eid;
	private String ename;
	
	
	public Employee(String eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public Employee() {
		
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = "Jfs-B71" + eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}