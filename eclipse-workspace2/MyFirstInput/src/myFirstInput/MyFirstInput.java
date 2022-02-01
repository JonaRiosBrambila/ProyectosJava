package myFirstInput;

import java.util.Scanner;

public class MyFirstInput {
	public static void main(String[]args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = console.nextLine();
		console.close();
		System.out.println("my name is: " +name);
	}
}
