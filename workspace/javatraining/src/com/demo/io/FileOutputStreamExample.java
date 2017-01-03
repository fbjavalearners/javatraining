package com.demo.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

public class FileOutputStreamExample {

	
	public static void main(String[] args) throws IOException {
		
		try {
			InputStream is = new FileInputStream("R:\\all\\files\\one.txt");
			int i=0;
			while((i=is.read())!= -1){
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
}
