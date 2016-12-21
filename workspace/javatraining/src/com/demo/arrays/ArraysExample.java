package com.demo.arrays;
import com.demo.constructors.Student;

public class ArraysExample {

	public static void main(String args[]){
		
		/*int [] myNumbers=null;
		System.out.println(myNumbers);
		myNumbers = new int[5];
		System.out.println("Before initializing let us see the values ");
		for(int i=0;i<=myNumbers.length;i++){
			System.out.println(" "+i+" th value is :: "+myNumbers[i]);
			
		}*/
		
		Student [] myStudents=null;
		myStudents = new Student[4];
		Student one = new Student(1,"Anil");
		Student two = new Student(2,"Rajiv");
		Student three = new Student(3,"Ashwinee");
		Student four = new Student(4,"Sindhu");
		myStudents[0]=one;
		myStudents[1]=two;
		myStudents[2]=three;
		myStudents[3]=four;
		
		for(int i=0;i<myStudents.length;i++){
			System.out.println(" "+i+" th student object is :: "+myStudents[i]);
			//Student s = myStudents[i];
			//System.out.println(" "+s.getName()+" "+s.getSid());
		}
		
		
		
		
		
	}
	
}
