package com.demo.accessmodifiers;

public class Student {

	int sid;
	String name;
	
	public Student(){
		
		
	}
	// two argument constructor
	public Student(int sid,String name){
		this.sid= sid;
		this.name=name;
		
		
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
