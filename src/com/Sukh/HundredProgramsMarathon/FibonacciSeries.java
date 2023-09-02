package com.Sukh.HundredProgramsMarathon;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int count;
		int c;
		System.out.println("Fibonacci Series:");
		
		
		for(count=1;count<=10;count++) {
			System.out.print(a+ " "); 
			c=a+b;
			a=b;
			b=c;
		}

	}

}


