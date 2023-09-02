package com.Sukh.HundredProgramsMarathon;

import java.util.Scanner;

public class MainCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
				System.out.println("Basic Calculator");
				System.out.println("1. Addition");
				System.out.println("2. Subtraction");
				System.out.println("3. Multiplication");
				System.out.println("4. Division");
				
				System.out.println("Enter your choice:");
				int choice = scanner.nextInt();
				
				if (choice == 5) {
	                System.out.println("Exiting the calculator.");
	                break; 
	            }
				
				System.out.print("Enter the first number:");
				double number1 = scanner.nextDouble();
				
				System.out.print("Enter the second number:");
				double number2 = scanner.nextDouble();
				
				double result= 0;
				
				switch(choice) {
				case 1:
					System.out.println("Your result of Addition is: " + Calculator.add(number1,number2) +".");
					break;
					
				case 2:
					System.out.println("Your result of Subtraction is: " + Calculator.subtract(number1,number2) +".");
					break;
					
				case 3:
					System.out.println("Your result of Multiplication is :" + Calculator.multiply(number1,number2) +".");
					break;
					
				case 4:
					if (number2 != 0) {
	                    result = number1 / number2;
	                    System.out.println("Your result of Division is :" + Calculator.divide(number1,number2) +".");
	                } else {
	                    System.out.println("Error: Division by zero!");
	                }
					
				default:
					System.out.println("Invalid choice!");
					
				}

}
		scanner.close();
	}
}
