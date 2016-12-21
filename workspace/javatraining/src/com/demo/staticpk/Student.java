package com.demo.staticpk;
/*
 * Instance methods that is method with out static key word has to be called only
 * through object reference
 * 
 * Ex: Student st = new Student();
 * st.getSid();
 * 
 * b)static methods can be called using ClassName.staticmethod name
 * 
 * Ex: Student.test();
 * 
 * c)There will be only one copy of static variable.For entire class there is
 * only one static variable and all the objects share this static variable.
 * 
 * d)There will be as many copies of instance variables as the no of objects created.
 * Each object has its own copy of instance variables
 */
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
	public   static int test(int a,int b){
		
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
	    Student.test(1, 2);
			
	}
	
	
	
}
