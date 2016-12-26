package com.demo.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.demo.accessmodifiers.Student;

public class SetExample {
	
	public static void main(String[] args) {
		
		
		/*Set hs = new HashSet();
		String one = "one";
		String two = "two";
		String three = "three";
		
		
		hs.add(one);
		hs.add(two);
		hs.add(three);
		hs.add("four");
		hs.add("eight");
		
		Iterator hsIt = hs.iterator();
		while(hsIt.hasNext()){
			String s = (String)hsIt.next();
			System.out.println(s);
		}
		
		*/
		
		
		Student one = new Student(1,"Rajiv","RajivReddy");
		Student two1 = new Student(1,"Rajiv","Rajivaaa");
		Student two = new Student(2,"Ashwinee");
		Student three = new Student(3,"Anil");
		
		Set<Student> students = new HashSet<Student>();
		students.add(one);
		students.add(two1);
		students.add(two);
		students.add(three);
		
		Iterator stIt = students.iterator();
		while(stIt.hasNext()){
			Student s = (Student)stIt.next();
			System.out.println(s.getSid());
		}
		
		
	}
	
	

}
