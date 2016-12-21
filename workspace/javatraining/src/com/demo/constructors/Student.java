package com.demo.constructors;

/*
 * If you don't provide any argumented constructor in class no arg constructor
 * is provided by default and super() statement method is added as part of the
 * default constructor
 * 
 * public Student(){
 *    super();
 * }
 * 
 * b)If you provide argumented constructor then it is our duty to add no arg
 * constructor in class.If you don't provide you can't use
 * new Student() as compiler didn't provide default when you add argumented 
 * constructor
 * 
 * c)super() method calls the immediate parents constructor
 * 
 * d)First statement in constructor should be call to super() or this constructor
 * with arguments
 * 
 */

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
	
			
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	
	
	
}
