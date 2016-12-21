package com.demo.inheritance;

public class BookShop extends Shop{

	 BookShop(){
		super();
		System.out.println("I am in Bookshop constructor ");
		
	}
	
	public void display(){
		System.out.println("I am in Book shop's display method ");
		
	}
	
	public static void main(String args[]){

	BookShop js = new BookShop();
	js.setAddress("Bangalore");
	js.setName("Himalaya " );
	
	System.out.println("name:: "+js.getName()+" address:: "+js.getAddress());
	js.display();
	}
	
}
