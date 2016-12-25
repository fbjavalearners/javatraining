package com.demo.inheritance;

public  class Shop {

	private String name;
	private String address;
	
	public Shop(){
		super();
		System.out.println("I am in Shop constructor ");
	}
	public  void display(){
		System.out.println("In super class shop's display ");
	}
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String args[]){
		
		/*Shop one = new Shop();
		one.setName("ShopOne");
		one.setAddress("Hyderabad");
		
		System.out.println("Shop name is :: "+one.getName()+" address:: "+one.getAddress());
		*/
		
	}
	
	
}
