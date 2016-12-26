package com.demo.collections;

import java.util.ArrayList;
import java.util.List;

import com.demo.accessmodifiers.Student;

public class CollectionMethods {

	
	public static void main(String[] args) {
		
		Student one = new Student(1,"Rajiv");
		Student two = new Student(2,"Ashwinee");
		Student three = new Student(3,"Anil");
		
		List<Student> students = new ArrayList<Student>();
		students.add(one);
		students.add(two);
		students.add(three);
		
		
		/*String one = "Rajiv";
		String two = "Ashwinee";
		String three ="Anil";
		
		List<String> nsList = new ArrayList<String>();
		nsList.add(one);
		nsList.add(two);
		nsList.add(three);
		nsList.contains("Anil");
		*
		*/
		
		Student anil = new Student(3,"Anil");
		
		boolean a = students.contains(anil);
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
