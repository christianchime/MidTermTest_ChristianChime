package com.Simple.Calculator;

import java.util.Scanner;

public class ScientificCalculator extends Calculator {
	
	int d,sq,cb;
	
	void Square() {
		sq = d * d;
		System.out.println("\nThe Square of: " + d + " is: " + sq);
	}
	
	void Cube() {
		cb = d * d * d;
		System.out.println("\nThe Cube of: " + d + " is: " + cb);
	}
	
	public static void main(String[] args) {
		
		int x, y = 0;
		Calculator calcS = new Calculator();
		ScientificCalculator calcS2 = new ScientificCalculator();
		
		System.out.println("SCIENTIFIC CALCULATOR");
		System.out.println("\nEnter First Number: ");
		Scanner read = new Scanner(System.in);
		 x = read.nextInt(); 
		
		System.out.println("Enter Operator (+, -, *, /, square or cube)");
		String operator = read.next(); 
		
		//if operator is square or cube, no need for a second number
		if(operator.equals("square")||operator.equals("cube"))
		{
			calcS2.d = x;
		}
		else {
		System.out.println("Enter Second Number: ");
		y = read.nextInt(); 
		}
		calcS.a = x;
		calcS.b = y;
		if (operator.equals("+")) {
			calcS.add();
		}
		else if (operator.equals("-")) {
			calcS.subtract();
		}
		else if (operator.equals("*")) {
			calcS.multiply();
		}
		else if (operator.equals("/")) {
			calcS.divide();
		}
		else if (operator.equals("square")) {
			
			calcS2.Square();
		}
		else if (operator.equals("cube")) {
			calcS2.Cube();
		}
		else
			//this handles situations where user enters wrong operator
			System.out.println("Enter Correct Operator Values!");
		read.close();
	}
	
}
