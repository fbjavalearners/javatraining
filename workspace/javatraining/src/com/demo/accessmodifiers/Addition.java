package com.demo.accessmodifiers;

public class Addition {

	public int add(int one,int two){
		
		return one+two;
		
		
	}
	
   public double add(double one,double two){
		System.out.println("I am in add method ");
		return one+two;
		
		
	}
	
	public static void main(String args[]){
		
		Addition ad = new Addition();
		int result = ad.add(48817,11615);
		System.out.print(" result is "+result);
		double result2 = ad.add(1.5, 2.5);
		System.out.print(" result is "+result2);
	}
	
}
