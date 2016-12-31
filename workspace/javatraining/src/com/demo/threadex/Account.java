package com.demo.threadex;

public class Account {

	private  int balance =50;
	
	public int getBalance(){
		return balance;
	}
	
	public void withdraw(int amount,String name){
		balance  = balance - amount;
		System.out.println(name +" is actually withdrawing "+amount+" bal is:: "+balance);
	}
}
