package com.Sukh.HundredProgramsMarathon;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Find if a number is Armnstrong Number or not!!");
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter a number:"); 
    	int number = scanner.nextInt();
    	
    	
    	if(isArmstrong(number)) {
    		System.out.print(number + " is an Armstrong Number.");
    	}
    	else {
    		System.out.print(number + " is not an Armstrong Number.");
    	}
    	
    	
    	scanner.close();
	
	}
	
	public static boolean isArmstrong(int value) {
		
		int temp = value;
		int digits = 0;
		int sum=0;
		int last;
		
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		
		temp = value;
		
		while(temp>0) {
			last=temp%10;
			sum = (int) (sum + Math.pow(last, digits));
			temp=temp/10;
		}
		
		if(sum != value) {
			return false;
		}
		
	return true;
	

	}
}


