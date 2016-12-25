package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 * Root class of exceptions is throwable
 * There are 2 types of classes of exceptions under Throwable 
 * a)Error class (These are generally not handled like memory completed like that )
 * b)Exception class
 *     It is further divided in to 2 types
 *       b1)Checked exceptions
 *           For checked exceptions you need to add try catch block or
 *           you need to declare the exception in throws clause
 *           Examples: FileNotFoundException,JdbcException
 *           
 *       b2)Runtime or unchecked exceptions
 *           These are checked at run time and compiler won't force you
 *           to write try catch or to declare throws clause 
 *             Examples: NullPointerException,ArrayStoreException
 * @author Rishitha
 *
 */
public class ExceptionExample {

	
	public static void main(String args[]) {
	 try{
		// db connection
		 //File open
		 ExceptionExample e = new ExceptionExample();
		e.test1();
	 }catch(Exception fe ){
		 fe.printStackTrace();
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
