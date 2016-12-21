package com.demo.decisionmaking;

public class LoopExamples {
    int a;
	
	public static void main(String args[]){
		
		boolean isRaining =true ;
		boolean isSunday=false;
		
		if(isRaining && isSunday)
			System.out.println("Order pizza/samosa and enjoy ");
		else
			System.out.println("Don't order ");
		
		
		for(int i=1;i<=100;i++){
			System.out.println(" counter:: "+i);
		}
		int j=2;
		for(;j<=100;j++){
			System.out.println(" counter:: "+j);
		}
		int k=3;
		while(k<=100){
			System.out.println("K is "+k);
			k++;
		}
		
	}
	public void test(){
		
	}
}
