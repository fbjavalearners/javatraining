package com.demo.inheritance;

public  class JewelleryShop extends Shop {

	int noOfBangles=100;
	
	public int getNoOfBangles() {
		return noOfBangles;
	}



	@Override
	public String toString() {
		return "JewelleryShop [noOfBangles=" + noOfBangles + "]";
	}



	public void setNoOfBangles(int noOfBangles) {
		this.noOfBangles = noOfBangles;
	}



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
