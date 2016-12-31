package genericexamples;

import com.demo.accessmodifiers.Student;

public class MyGenericClass<T>{
	
	
	public void addTwoNumbers( T one,T two){
		System.out.println(one);
	}
	
	
	public static void main(String args[]){
		
		MyGenericClass<Integer> s = new MyGenericClass<Integer>();
		//1 will become new Integer(1)
		s.addTwoNumbers(new Integer(1),new Integer(2));
	
		
		
	}

}
