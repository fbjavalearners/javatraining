package com.demo.threadex;

public class AccountDanger implements Runnable{
  private Account acct = new Account();
  public static void main(String[] args) {
	 AccountDanger r = new AccountDanger();
	 Thread one = new Thread(r);
	 Thread two = new Thread(r);
	 one.setName("Anil");
	 two.setName("Rajiv");
	 one.start();
	 two.start();
  }
@Override
public void run() {
	for(int x=0;x<4;x++){
		makeWithdrawal(10);
		if(acct.getBalance()<0){
			System.out.println("account is overdrawn ");
		}
		
	}
	
}
private synchronized void makeWithdrawal(int amt){
	
	if(acct.getBalance()>=amt){
		System.out.println(Thread.currentThread().getName()+" is going to withdraw "+amt+" bal is :: "+acct.getBalance());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ex){}
		acct.withdraw(amt,Thread.currentThread().getName());
	}else{
		System.out.println("Not enough in account for "+Thread.currentThread().getName()+" to withdraw "+acct.getBalance());
	}
	
}
	
	
	
	
}
