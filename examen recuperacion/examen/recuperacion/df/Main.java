package examen.recuperacion.df;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String opcion;

		do {
			System.out.println("=============================================");
			System.out.println("Programa de Figuras, escoja una opción");
			System.out.println("1. Imagen triangulo");
			System.out.println("2. SALIR");
			System.out.println("=============================================");
			opcion = teclado.nextLine();

			switch (opcion) {

			case "1":
				
				System.out.print("Introduzca la Dimencion: ");
				int numFilas = teclado.nextInt();

				System.out.println();

				for (int numBlancos = numFilas - 1,
						numAsteriscos = 1; numBlancos >= 0; numBlancos--, numAsteriscos += 2) {

					for (int i = 1; i <= numBlancos; i++) {
						System.out.print(" ");
					}

					for (int j = 1; j <= numAsteriscos; j++) {
						System.out.print("*");
					}
					System.out.println();
				}

				break;

			case "2":

				break;

			default:

				break;
			}

		} while (!opcion.equals("2"));
		System.out.println("Gracias por usar nuestro sistema.....");
	}

}
