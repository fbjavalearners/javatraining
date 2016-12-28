package com.demo.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

import java.util.Set;

import com.demo.accessmodifiers.Student;

public class LinkedHashset {

	public static void main(String[] args) {

		Student one = new Student(1,"Rajiv","RajivReddy");
		Student two1 = new Student(1,"Rajiv","Rajivaaa");
		Student two = new Student(2,"Ashwinee");
		Student three = new Student(3,"Anil");
		Student four = new Student(3,"Anil");
		
		Set<Student> students = new LinkedHashSet<Student>();
		students.add(one);
		students.add(two1);
		students.add(two);
		students.add(three);
		students.add(four);
		
		Iterator stIt = students.iterator();
		while(stIt.hasNext()){
			Student s = (Student)stIt.next();
			System.out.println(s);
		}
		//System.out.println(students.size());
		
		
	}
	
}
