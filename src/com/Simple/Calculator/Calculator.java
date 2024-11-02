package com.Simple.Calculator;

public class Calculator {

	int a, b,sum,sub,mult;
	double div;
	
	void add() {
		sum = a + b;
		System.out.println("\n" + a + " plus " + b + " is: " + sum);
	}
	void subtract() {
		sub = a - b;
		System.out.println("\n" + a + " minus " + b + " is: " + sub);
	}
	void multiply() {
		mult = a * b;
		System.out.println("\n" + a + " multiplied by " + b + " is: " + mult);
	}
	void divide() {
		try {
		div = a / b;
		//Assumption: displayed results are not expected to be decimals
		System.out.println("\n" + a + " divided by " + b + " is: " + div);
		} catch(ArithmeticException e1) {
			System.out.println("Error message is "+e1);
		} finally {
			System.out.println("Please try Again");
		}
	}
}