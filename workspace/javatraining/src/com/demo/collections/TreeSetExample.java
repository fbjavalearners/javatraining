package com.demo.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.accessmodifiers.Student;

public class TreeSetExample {
	
	
	public static void main(String[] args) {
		
		Student one = new Student(1,"Rajiv");
		Student two = new Student(2,"Ashwinee");
		Student three = new Student(3,"Anil");
		
		
		
		Set<Student> ts = new TreeSet<Student>();
		ts.add(one);
		ts.add(two);
		ts.add(three);
		
		for(Student s:ts){
			System.out.println(s);
		}
		
		
		
		
		
		
	}

}
