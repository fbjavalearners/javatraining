package com.demo.threadex;

public class EvenNumberRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=500;i++){
			if(i%2 == 0){
				System.out.println("I value is:: "+i+Thread.currentThread().getName());
			}
			
		}
	}

}
