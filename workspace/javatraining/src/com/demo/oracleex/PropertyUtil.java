package com.demo.oracleex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {

	
	public static Properties getProperties(){
		Properties prop = new Properties();
		InputStream input = null;

    	try {

			input = new FileInputStream("R:\\gitrepos\\javatraining\\workspace\\javatraining\\src\\com\\demo\\oracleex\\jdbc.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return prop;
		
	}
	
	
	
}
