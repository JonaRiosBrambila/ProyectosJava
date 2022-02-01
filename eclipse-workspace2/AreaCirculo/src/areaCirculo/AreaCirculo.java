package areaCirculo;
import java.util.Scanner;
public class AreaCirculo {
	public static void main(String[]args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Type the diameter");
		double diameter = console.nextInt();
		
		double radio = diameter /2;
		final double pi = 3.1416;
		int area = (int) (pi*(radio*radio)) ;
		int perimeter = (int) (pi * diameter);
		double area2 = area;
		double perimeter2 = perimeter;
		System.out.println("The area of circle is " + area2 + " and the perimeter is " +perimeter2);
		
		
	}
}
