package com.demo.equalsexample;

import com.demo.accessmodifiers.Addition;

public class Student {

	private int sid;
	private String name;
	
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
	
	
	
	public static void main(String[] args) {
		Student rajiv = new Student(1,"Rajiv");
		Student rajivtwo = new Student(1,"Rajeev");
		
		
		Addition ad = new Addition();
		if(rajiv.equals(rajivtwo)){
			System.out.println("Equal Object ");
			
			
		}else{
		  System.out.println("Not equal ");	
			
		}	
		}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()){
			System.out.println(getClass() +" "+obj.getClass());
			return false;
		}
			
		Student other =  (Student)obj;
		
		if (sid != other.sid)
			return false;
		return true;
	}
	
	}
	
	

