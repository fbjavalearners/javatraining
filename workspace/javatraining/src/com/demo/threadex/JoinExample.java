package com.demo.threadex;

public class JoinExample {

	
	
	public static void main(String[] args) {
		
	   Thread t = new Thread(new JoinThread());
	   t.setPriority(Thread.MAX_PRIORITY);
	   t.start();
	   Thread et = new Thread(new EvenThread());
	   et.start();
	  
	  /* try {
		t.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	   System.out.println("I am in main ");
	   for(int i=0;i<=100;i++){
		   System.out.println("Main:: "+i);
	   }
		
		
	}
	
	
}
