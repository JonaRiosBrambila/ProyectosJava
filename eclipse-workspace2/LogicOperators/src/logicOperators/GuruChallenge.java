package logicOperators;
import java.util.Scanner;
public class GuruChallenge {
	public static void main(String[]args) {
		try (Scanner calculator = new Scanner(System.in)) {
			System.out.println("Ingresa tu estatura en m");
			double est = calculator.nextDouble();
			
			System.out.println("Ingresa tu peso en kg");
			double peso = calculator.nextDouble();
			
			double imc = peso / (est * est);
			calculator.close();
			System.out.println("Tu IMC es de: " + imc);
			
			if (imc >= 18.5 && imc == 24.9) {
				System.out.println("Tu relacion peso-estatura es saludable");
			}else if ( imc > 24.9) {
				System.out.println("Tu relacion peso-estatura podria ser mejor: imc muy alto");
			}else if (imc < 18.5) {
				System.out.println("Tu relacion peso-estatura podria ser mejor: imc muy bajo");
			}
			
		}
	}
}
