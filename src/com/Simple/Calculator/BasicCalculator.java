package com.Simple.Calculator;

import java.util.Scanner;

public class BasicCalculator extends Calculator {
	
	int a,b,c, sum;
	
//	int sum(int x, int y) {
//		int s = x + y;
//		System.out.println("Sum of 2 integers: " + s);
//		return s;
//	}
	//overloaded for 3 integers
	void add() {
		sum = a + b + c;
		System.out.println("\n" + a + " plus " + b + " plus " + c +" is: " + sum);
	}
	
	public static void main(String[] args) {
		
		int x, y, z= 0;
		String n = null;
		Calculator calcB = new Calculator();
		BasicCalculator calcB2 = new BasicCalculator();
		
		System.out.println("BASIC CALCULATOR, ADD 2 OR 3 NUMBERS: ");
		System.out.println("\nEnter First Number: ");
		Scanner read = new Scanner(System.in);
		 x = read.nextInt(); 
		
		System.out.println("Enter Operator (+, -, *, /)");
		String operator = read.next(); 
		
		System.out.println("Enter Second Number: ");
		y = read.nextInt(); 
		
		
		//if + operator is selected, users can enter a third number
		if(operator.equals("+"))
		{
		System.out.println("Would you like to add a third number?: (y/n)");
		n = read.next(); 
		System.out.println("Enter Third Number: ");
		z = read.nextInt(); 
		
		}
		
		calcB.a = x;
		calcB.b = y;
		calcB2.c = z;
		calcB2.a = x;
		calcB2.b = y;
		
		if (operator.equals("+") && n.equals("y")) {
			calcB2.add();
		}
		else if (operator.equals("+")) {
			calcB.add();
		}
		else if (operator.equals("-")) {
			calcB.subtract();
		}
		else if (operator.equals("*")) {
			calcB.multiply();
		}
		else if (operator.equals("/")) {
			calcB.divide();
		}
		else
			//this handles situations where user enters wrong operator
			System.out.println("Enter Correct Operator Values!");
	
		read.close();
	}

}
