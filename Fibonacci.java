package Loops;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
			try (Scanner scann = new Scanner(System.in)) {
			System.out.println("Ingresa un numero: ");
			int n = scann.nextInt();
			int cont=1;
			int x=0;
			int y=1;
			int z=1;
			
			System.out.println("-------------------");
			
			if(n<1) {
			System.out.println("0");
			}else if(n==1){
			System.out.println("0");
			System.out.println("1");	
			}else{
				System.out.println("0");
				System.out.println("1");
			do {
				
				z = x + y;
				x = y;
				y = z;
				System.out.println(z);
				
				cont++;
			}while(cont!=n);
		
			}

		}
	}
	
}
