package com.Simple.Calculator;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CALCULATOR FOR TWO NUMBERS");
		System.out.println("\nEnter First Number: ");
		Scanner read = new Scanner(System.in);
		int x = read.nextInt(); 
		
		System.out.println("Enter Operator (+, -, *, or /)");
		String operator = read.next(); 
		
		System.out.println("Enter Second Number: ");
		int y = read.nextInt(); 
		
		
		
		Calculator calc = new Calculator();
		
		calc.a = x;
		calc.b = y;
		if (operator.equals("+")) {
			calc.add();
		}
		else if (operator.equals("-")) {
			calc.subtract();
		}
		else if (operator.equals("*")) {
			calc.multiply();
		}
		else if (operator.equals("/")) {
			calc.divide();
		}
		else
			//this handles situations where user enters wrong operator
			System.out.println("Enter Correct Operator Values!");
		
		read.close();
	}

}
