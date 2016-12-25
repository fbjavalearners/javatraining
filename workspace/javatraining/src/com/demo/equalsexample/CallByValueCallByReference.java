package com.demo.equalsexample;

public class CallByValueCallByReference {
    public static int modifyValue(int i ){
    	i=20;
    	return i;
    }
    public static void modifyStudent(Student s ){
    	s.setName("Sandy");
    }
	
	public static void main(String[] args) {
		
		/*int i=10;
		modifyValue(i);*/
		
		Student st = new Student(1,"Sandeep");
		System.out.println("Before modifying :: "+st.getName());
		modifyStudent(st);
		System.out.println("After modifying :: "+st.getName());
		//System.out.println(" i value after returning from method "+i);
		
		
	}
	
	
}
