package proyectoColaborativo;

import utilidades.Leer;

public class Main {

	public static void main(String[] args) {
		double numero1, numero2;
		int menu;
		do {
			System.out.println("1.Para sumar");
			System.out.println("2.Para multiplicar");
			menu = Leer.datoInt();
			switch (menu) {
				case 1:
					System.out.println("Introduzca el primer numero");
					numero1 = Leer.datoDouble();
					System.out.println("Introduzca el segundo numero");
					numero2 = Leer.datoDouble();
					System.out.printf("El resultado es %.4f", numero1 + numero2);
					break;
				case 2:
					System.out.println("Introduzca el primer numero");
					numero1 = Leer.datoDouble();
					System.out.println("Introduzca el segundo numero");
					numero2 = Leer.datoDouble();
					System.out.printf("El resultado es %.4f", numero1 * numero2);
					break;
			}
		} while (menu != 0);
		System.out.println("Gracias por usar el programa");
	}
}
