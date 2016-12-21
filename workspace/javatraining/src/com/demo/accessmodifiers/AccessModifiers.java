package com.demo.accessmodifiers;
/*
 * Class can be added with 2 modifiers
 *   a)(default)if you don't give any thing it is default access and class is accessible
 *   only with in package
 *   
 *   b)(public) It can be accessed from anywhere from any package. Outside the package
 *   you need to add import statement first and then use it
 * 
 * 
 * 4 types of access modifier for instance variables and methods
 * a)private -- Accessible only with in the class
 * b)public -- Accessible from anywhere
 * c)default -- Accessible only with in package
 * d)protected -- Accessible with in package plus child subclasses in other packages
 * can access the class through inheritance.
 * 
 * 
 */
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
