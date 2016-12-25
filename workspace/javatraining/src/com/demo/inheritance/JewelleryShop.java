package com.demo.inheritance;

public  class JewelleryShop extends Shop {

	public JewelleryShop(){
		System.out.println("I am in Jewellery constructor ");
		
	}
	
	
	
	public static void main(String args[]){
		
		
		
		
		// Super class reference can hold any subclass object
		
		Shop jewShop = new JewelleryShop();
		
		Shop bShop = new BookShop();
	
		jewShop.display();
		bShop.display();
		
		
	}

	
}
