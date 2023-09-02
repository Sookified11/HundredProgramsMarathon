package com.Sukh.HundredProgramsMarathon;

import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = Calc.add(num1, num2);
                break;
            case 2:
                result = Calc.subtract(num1, num2);
                break;
            case 3:
                result = Calc.multiply(num1, num2);
                break;
            case 4:
                try {
                    result = Calc.divide(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                    return; 
                }
                break;
            default:
                System.out.println("Invalid choice");
                return;
    }
}}

