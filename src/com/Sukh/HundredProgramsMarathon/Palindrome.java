package com.Sukh.HundredProgramsMarathon;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
System.out.println("Find if a number is Palindrome or not!!");
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter a number:"); //enter a number
    	int number = scanner.nextInt();
    	
    	
    	if(isPalindrome(number)) {
    		System.out.print(number + " is a Palindrome");
    	}
    	else {
    		System.out.print(number + " is not a Palindrome");
    	}
    	
    	
    	scanner.close();
	
	}
	
	public static boolean isPalindrome(int num) {
		
		int temp = num;
		int sum = 0;
		
		
		while(num>0) {
			
			int r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}
		return temp == sum;
		
		
	
}
}
