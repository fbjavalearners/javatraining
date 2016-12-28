package com.demo.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {

	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("Anil");
		l.add("Rajeev");
		l.add("Ashwinee");
		l.add("Sandeep");
		
		l.addFirst("Test");
		ListIterator it = l.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
			
		}
		System.out.println("Reverse ");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		
	}
	
	
}
