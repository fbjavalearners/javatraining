package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.demo.accessmodifiers.Student;

public class ComparableExample {
	
	
	public static void main(String[] args) {
		
		List names = new ArrayList();
		Student one  =new Student(1,"Anil");
		Student two = new Student(2,"Ram");
		names.add(one);
		names.add(two);
		
		for(int i=0;i<names.size();i++){
			Student s =(Student)names.get(i);
			
		}
		
		
		List<Student> ns=new ArrayList<Student>();
		ns.add(one);
		ns.add(two);
		
		for(int i=0;i<ns.size();i++){
			Student s = ns.get(i);
		}
		
		List<String> nsList = new ArrayList<String>();
		
		nsList.add("Zahir");
		nsList.add("Anil");
		nsList.add("Ashwinee");
		nsList.add("Rajiv");
		nsList.add("Sindu");
		
		
		Collections.sort(nsList);
		
		for(String s:nsList){
			System.out.println(s);
		}
		
		
		Collections.sort(names);
		
		System.out.println("After sorting ");
		for(int i=0;i<names.size();i++){
			Student s =(Student)names.get(i);
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
	}

}
