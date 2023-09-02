package com.Sukh.HundredProgramsMarathon;

import java.util.Scanner;

public class EnterNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int number = scanner.nextInt();
		
		System.out.print("You entered:" + number);
		
		scanner.close();
		
		

	}

}
