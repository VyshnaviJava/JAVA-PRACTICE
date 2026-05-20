package com.Oops;

//whatever we are creating a encapsulated class is considered as a
//DTO : Data transfer object
//POJO : plain old java object
//MODEL OBJECT : same like your database table

public class Student {
	private int sid;
	private String sname;
	private long phone;
	
	public void setSid(int sid){
		this.sid = sid;
	}
	public int getSid() {
		return sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSname(){
		return sname;
	}
	public void setphone(long phone) {
		this.phone = phone;
	}
	public long getphone() {
		return phone;
	}

}
