package com.Sukh.HundredProgramsMarathon;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		System.out.println("Find if a string is Palindrome or not!!");
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter a strings:"); 
    	String str = scanner.nextLine();
    	
    	
    	if(isPalindrome(str)) {
    		System.out.print(str + " is a Palindrome");
    	}
    	else {
    		System.out.print(str + " is not a Palindrome");
    	}
    	
    	
    	scanner.close();
	
	}
	
	public static boolean isPalindrome(String input) {
		
		input=input.toLowerCase();
		int left = 0;
		int right = input.length()-1;
		
		while(left<right) {
			if(input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
		

	}
}

