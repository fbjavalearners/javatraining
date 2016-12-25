package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample {

	
	public static void main(String args[]) {
	 try{
		// db connection
		 //File open
		 ExceptionExample e = new ExceptionExample();
		e.test1();
	 }catch(Exception fe ){
		 System.out.println("File couldn't be opened please check if file exists ");
	 }
	 System.out.println("End of main method ");	
	}
	
	public void test1()throws Exception{
		System.out.println("I am in test1 ");
        test2();
        System.out.println("I am in test11 ");
	
	}
	public void test2() throws Exception{
		System.out.println("I am in test2");
		test3();
		System.out.println("I am in test21 ");
	}
	public void test3() throws Exception{
		
		throw new MyOwnException("Creating and throwing the exception object ");
		
	}
	
}
