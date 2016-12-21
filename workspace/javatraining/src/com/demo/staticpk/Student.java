package com.demo.staticpk;

public class Student {

	private int sid;
	private String name;
	private static int counter;
	private static int counter2;
	
	public Student(){
		counter = counter +1;
	}
	

	// two argument constructor
	public Student(int sid,String name){
		this.sid= sid;
		this.name=name;
		
		
	}
	public int getSid() {
		System.out.println("I am in getSid method ");
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
	public   int test(int a,int b){
		
		System.out.println("This is static method ");
		return a+b;
	}

	public static void main(String args[]){
		Student one = new Student();	
	    //one.setName("StudentOne");
		System.out.println(" no of objects "+counter);
	    
	    Student two = new Student();	
	    two.setName("StudentTwo");
	    
	    System.out.println(" no of objects "+counter);	
			
	}
	
	
	
}
