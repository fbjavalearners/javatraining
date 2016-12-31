package com.demo.threadex;

/*
 * If one thread enters synchronized method in an object other threads can't
 * enter synchronized methods in the same object as the object level lock is already
 * taken
 * 
 * If one thread enters synchronized non static method other threads can't enter
 * non static synchronized methods where as they can enter static synchronized methods
 * 
 * 
 */

public class EvenThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<=500;i++){
			
			if(i==10){
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(i%2 == 0){
				System.out.println("I value is:: "+i+Thread.currentThread().getName());
			}
			
		}
	}

	public static void main(String[] args) {
		
		EvenThread t = new EvenThread();
		t.start();
		
	}
	
	
	
	
}
