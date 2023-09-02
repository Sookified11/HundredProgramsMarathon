package com.Sukh.HundredProgramsMarathon;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int number = scanner.nextInt();
		
		scanner.close();
		int temp = number;
		
		int x = 1;
		
		
		
		while(number>=1)
		{
			x = x*number;
			number--;
		}
		
		
		System.out.println(temp+ "! = " +x);
	
	}

}
