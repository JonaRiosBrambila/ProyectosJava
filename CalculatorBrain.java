package com.generation;

import java.util.Scanner;

public class CalculatorBrain {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Valor 1: ");
		double a = s.nextDouble();
		System.out.println("Valor 2: ");
		double b = s.nextDouble();
		
		
		suma( a, b );
		resta( a, b);
		multiplicacion(a,b);
		division(a,b);
		square(a,b);
		powerOf(a,b);
	}

	
	private static void powerOf(double a, double b) {
	
		System.out.println("Power " +a +" of " +b +" is " + Math.pow(a, b));
		
	}


	private static void square(double a, double b) {
		
		System.out.println("Sqare Root of " +a +" is " +Math.pow(a,0.5));
		System.out.println("Square Root of " + b + " is " +Math.pow(b,0.5));
		
	}


	private static void suma(double a, double b) {
		System.out.println("La súma es: " +(a + b));
		
	}
	
	private static void resta( double a, double  b) {
		System.out.println("La esta es: " +(a - b));
		
	}
	
	private static void multiplicacion(double a, double b) {
		System.out.println("La multiplicación es: " +(a * b));
		
	}
	
	private static void division(double a, double b) {
		System.out.println("La división es: " +(a / b));
		
	}

	
	
}
