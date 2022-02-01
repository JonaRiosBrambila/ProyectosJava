package controlDeFlujo;

public class IfCondition {
	public static void main(String[]args) {
		int age = 17;
	if ( age < 18 && age > 0) {
		// Ejecutar declaración de bloque;
		System.out.println("Eres menor de edad");
		} 
	else if(age >= 18) {
		// Ejecutar segunda declaración de bloque de condición;
		System.out.println("Eres mayor de edad");
		} else{
		// Ejecutar otra declaración de bloque;
		System.out.println("Numero no valido");
		}
	}

}
