package com.Sukh.HundredProgramsMarathon;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
    	
    	System.out.println("Find if a number is Prime or not!!");
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter a number:"); //enter a number
    	int number = scanner.nextInt();
    	
    	
    	if(isPrime(number)) {
    		System.out.print(number + " is a Prime Number");
    	}
    	else {
    		System.out.print(number + " is not a Prime Number");
    	}
    	
    	
    	scanner.close();
    }
    	
    	public static boolean isPrime(int num) {
    		if(num<2) {
    			return false;
    		}
    		
    		for(int i=2;i<=Math.sqrt(num);i++) {
    			if(num%i==0) {
    				return false;
    			}
    		}
    			
    	
    	return true;
    	
    		}
    		
    	}
    	
    	
    	
    	
    	
    		
    	
   

