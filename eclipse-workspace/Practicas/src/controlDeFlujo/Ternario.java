package controlDeFlujo;
import java.util.Scanner;
public class Ternario {
	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		System.out.println("Introduce tu edad: ");
		int age = s.nextInt();
		s.close();
		System.out.println(age>=18 ? "Eres mayor de edad": age<18 && age>0 ? "Eres menor de edad" : "Numero invalido" );
		
	}

}

