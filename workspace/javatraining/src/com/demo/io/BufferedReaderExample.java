package com.demo.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	
	public static void main(String[] args) throws IOException {
		
		 String  thisLine = null;
			      try{
			         // open input stream test.txt for reading purpose.
			         BufferedReader br = new BufferedReader(new FileReader("R:\\all\\files\\one.txt"));
			         while ((thisLine = br.readLine()) != null) {
			            System.out.println(thisLine);
			         }       
			      }catch(Exception e){
			         e.printStackTrace();
			      }
		
		
		
		
		
		
		
	}
	
}
