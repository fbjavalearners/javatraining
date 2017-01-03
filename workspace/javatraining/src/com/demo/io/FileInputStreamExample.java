package com.demo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamExample {

	
	public static void main(String[] args) throws IOException {
		
		try {
			OutputStream os = new FileOutputStream("R:\\all\\files\\three.txt");
			byte[] b=new byte[]{'A','N','I','h'};
			os.write(b);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
}
