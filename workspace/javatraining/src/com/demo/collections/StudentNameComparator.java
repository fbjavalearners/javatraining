package com.demo.collections;

import java.util.Comparator;

import com.demo.accessmodifiers.Student;

public class StudentNameComparator implements Comparator{

	@Override
	public int compare(Object s1, Object s2) {
		
		Student s11=(Student)s1;
		Student s12=(Student)s2;
		
		return s11.getName().compareTo(s12.getName());
	}

}
