package com.demo.threadex;

public class OddThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<=500;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%2 != 0){
			  System.out.println("I value is:: "+i+Thread.currentThread().getName());
			}
			
		}
	}
	

	public static void main(String[] args) {
		
		OddThread o = new OddThread();
		o.setName("Odd Thread");
		o.start();
		EvenThread e = new EvenThread();
		e.setName("Even Thread");
		e.start();
		EvenNumberRunnable enr = new EvenNumberRunnable();
		Thread rt = new Thread(enr);
		rt.setName("This is runnable ");
		rt.start();
		
		
	}
	
	
	
	
}
