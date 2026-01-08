package proyectoColaborativo;

import utilidades.Leer;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola, buenas este programa simula una calculadora.");
		
		double numero1, numero2;
		int menu;
		do {
			System.out.println("Elija una de las siguientes opciones: ");
			System.out.println("3.Para restar");
			System.out.println("4.Para dividir");
			System.out.println("0.Para salir");
			System.out.println("Introduce el número de la opción elegida: ");
			menu=Leer.datoInt();
			switch (menu) {
				case 3:
					System.out.println("Introduce el primer número: ");
					numero1=Leer.datoDouble();
					System.out.println("Introduce el segundo número: ");
					numero2=Leer.datoDouble();
					System.out.printf("El resultado es %.2f", numero1-numero2); 
					break;
					
				case 4:
					System.out.println("Introduce el primer número: ");
					numero1=Leer.datoDouble();
					System.out.println("Introduce el segundo número: ");
					numero2=Leer.datoDouble();
					System.out.printf("El resultado es %.2f", numero1/numero2); 
					break;
					
				case 0:
					break;
					
				default:
					System.out.println("El número introducido es incorrecto, vuelva a intentarlo");
			}
		} while (menu != 0);
		
	}

}
