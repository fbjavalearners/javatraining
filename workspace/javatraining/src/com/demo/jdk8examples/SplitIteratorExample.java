package com.demo.jdk8examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SplitIteratorExample {

	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Anil");
		names.add("Ashwinee");
		names.add("Sandeep");
		names.add("Sindura");
		names.add("Rajiv");
		
		Stream<String>s = names.stream();
		Spliterator<String> sp = s.spliterator();
		//while(sp.tryAdvance((n) -> System.out.println(n)));
		//sp=s.spliterator();
		sp.forEachRemaining((n) -> System.out.println(n));

		
	}
	
	
}
