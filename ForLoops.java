package Loops;

import java.util.Scanner;

public class ForLoops {
	
	public static void main(String[] args) {
		
		try (Scanner scann = new Scanner(System.in)) {
			System.out.println("Ingresa un nombre: ");
			String n = scann.nextLine();
			
			for(int i=0;i<n.length();i++) {
				System.out.println("letter "+i+":"+n.charAt(i));
			}
			
		}
	}
}
