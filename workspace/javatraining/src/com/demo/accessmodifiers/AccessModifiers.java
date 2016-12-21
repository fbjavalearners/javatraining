package com.demo.accessmodifiers;

public class AccessModifiers {

	public static void main(String args[]){
		
		Student one = new Student();
		System.out.println("sid is "+one.sid);
		
		one.name="StudentOne";
		one.sid=1;
		
		System.out.println("sid is "+one.sid);
		
		Student two = new Student();
	
		
		two.name="StudentTwo";
		two.sid=2;
		
        Student three = new Student();
	
		
		three.name="StudentThree";
		three.sid=3;
		
		Student four = new Student(4,"StudentFour");
		
		
	}
	
}
