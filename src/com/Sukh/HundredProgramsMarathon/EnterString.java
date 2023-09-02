package com.Sukh.HundredProgramsMarathon;

import java.util.Scanner;

public class EnterString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a String:");
		
		String str = scanner.nextLine();
		
		System.out.print("Your entered String is:" +str);
		
		scanner.close();

	}

}
