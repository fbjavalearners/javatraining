package com.demo.io;

import java.io.File;
import java.io.IOException;

public class FileExamples {

	
	public static void main(String[] args) {
		
		File f = new File("R:\\all\\files");
	
		if(f.isDirectory()){
			System.out.println("It is directory ");
		}else{
			System.out.println("It is not directory ");
		}
		
		File fs = new File("R:/all/files/rajiv.txt");
		try {
			fs.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fs.delete();
		System.out.println(fs.getAbsolutePath());
		
		File fss = new File("R:/all/filesdir");
		fss.mkdir();

		
		
	}
	
}
