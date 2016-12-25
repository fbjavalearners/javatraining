package com.demo.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import com.demo.accessmodifiers.Student;

public class ListExamples {

	public static void main(String args[]){
		
		String one = "one";
		String two = "two";
		String three = "three";
		//ArrayList internally uses again 
		
	    List numbers = new ArrayList();
	    numbers.add(one); // 0
	    numbers.add(two); // 1
	    numbers.add(three); //2
	    
	    
	    System.out.println("Second object is :: "+numbers.get(1));
	    
		//One way
	    for(int i=0;i<numbers.size();i++){
	    	String s = (String)numbers.get(i);
	    	//System.out.println("i:: "+i+" "+numbers.get(i));
	    	
	    }
	    
	  
		System.out.println("size of collection is :: "+numbers.size());
		
		//collections only objects you can add
		//no primitives
		//int float double long short char boolean -- primitives
		
		
		List<String> num = new ArrayList<String>();
		Student s = new Student(1,"Ashwinee");
		
		
		num.add("Anil");
		num.add("Ashwinee");
		num.add("sandeep");
		num.add("sindu");
		
		for(String name:num){
			
			System.out.println(" "+name);
			
		}
		//ns.add(new Integer(1));
	  //jdk1.5 internally 1 = new Integer(1) autoboxing
		List ns = new ArrayList();
		ns.add(1);
		
		displayList(num);
		System.out.println("***********");
		displayList(numbers);
		
	}
	
	public static void displayList(List genList ){
		  Iterator it = genList.iterator();
			while(it.hasNext()){
				String s = (String)it.next();
				System.out.println(" "+s);
				
			}
		
	}
	
	
}
