package controlDeFlujo;

public class IfCondition {
	public static void main(String[]args) {
		int age = 17;
	if ( age < 18 && age > 0) {
		// Ejecutar declaraci�n de bloque;
		System.out.println("Eres menor de edad");
		} 
	else if(age >= 18) {
		// Ejecutar segunda declaraci�n de bloque de condici�n;
		System.out.println("Eres mayor de edad");
		} else{
		// Ejecutar otra declaraci�n de bloque;
		System.out.println("Numero no valido");
		}
	}

}
