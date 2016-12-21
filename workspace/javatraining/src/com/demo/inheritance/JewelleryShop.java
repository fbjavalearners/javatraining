package com.demo.inheritance;

public class JewelleryShop extends Shop {

	public JewelleryShop(){
		System.out.println("I am in Jewellery constructor ");
		
	}
	
	public void display(){
		System.out.println("I am in jewellery shops display method ");
		
	}
	
	public static void main(String args[]){
		BookShop bs = new BookShop();
		bs.setAddress("Bangalore");
		bs.setName("Himalaya " );
		
		JewelleryShop js = new JewelleryShop();
		js.setAddress("Hyderabad");
		js.setName("Kalyan Jewellers" );
		
		
		Shop s = new Shop();
		s.display();
		
		// Super class reference can hold any subclass object
		
		Shop jewShop = new JewelleryShop();
		
		Shop bShop = new BookShop();
	
		js.comDisplay(jewShop);
		js.comDisplay(bShop);
		
		
	}

	public void comDisplay(Shop s){
		
		s.display();
	}
}
