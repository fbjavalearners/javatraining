package com.demo.inheritance;

public class C extends B{

	public C(){
		this(1,2); //first line will be super or any arg const in same class
		System.out.println("In C constructor ");
		
	}
	public C(int a, int b){
		super();
		System.out.println(" a "+a+"b "+b);
		
	}
	public void test(){
		
	}
	public static void main(String args[]){
		
		C ob = new C();
		
		
		
		
		
		
		
	}
	
	
}
