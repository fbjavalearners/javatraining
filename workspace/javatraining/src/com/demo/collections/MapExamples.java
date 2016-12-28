package com.demo.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.demo.accessmodifiers.Student;

public class MapExamples {

	
	public static void main(String[] args) {
		
		Map kvp = new LinkedHashMap();
		kvp.put("IND", "INDIA");
		kvp.put("USA","UNITED STATES OF AMERICA");
		
		Set allValues = kvp.entrySet();
		Iterator it = allValues.iterator();
		while(it.hasNext()){
			Entry e  = (Entry)it.next();
			System.out.println(e.getKey()+"  "+e.getValue());
			
			
		}
		
	
		
		Map<String,String> tm = new TreeMap<String,String>();
		tm.put("Zahir", "Zahirkhan");
		tm.put("AK", "AnilKumble");
		
		/*Iterator its = tm.entrySet().iterator();
		while(its.hasNext()){
			Entry e  = (Entry)its.next();
			System.out.println(e.getKey()+"  "+e.getValue());
			
			
		}*/
		
		
		Student s1 = new Student(1,"Rajiv");
		Student s2 = new Student(2,"Ashwinee");
		Student s3 = new Student(3,"Anil");
		
		Map<Integer,Student> smp=new TreeMap<Integer,Student>();
		smp.put(1, s1);
		smp.put(2, s2);
		smp.put(3, s3);
		

		
		Iterator its = smp.entrySet().iterator();
		while(its.hasNext()){
			Entry e  = (Entry)its.next();
			System.out.println(e.getKey()+"  "+e.getValue());
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
