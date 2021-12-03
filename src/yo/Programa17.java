/**
 * @(#)Programa17.java	1.00 	01/12/2021
 */
package yo;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
/**
 * @version 1.00 30/11/2021 PENDIENTE 
 * @author Jesús Guevara, Ludwicka Aguirre
 */
public class Programa17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner (System.in);
		int elem[] = new int[50];
		int elem2[] = new int[25];
		int id = 0;
		int x;
		int j = 1;
		int k = 0;
		int c = 0; // para contar cuantas veces se encuentra el valor a buscar
		Random rd = new Random();
		String r; // respuesta de si desea repetir o no
		System.out.println("Programa que imprime un vector, busca un valor"
				+ " dado por el usurio, imprime las posiciones impares e "
				+ " imprime los multiplos de 3 de las posiciones impares");
		do {
			try {
				for (int i = 0; i < 50; i++) {
					elem[i] =  rd.nextInt(100) + 1;
				}
				System.out.println("Los valores del arreglo son:");				
				for (int i = 0; i < 50; i++) {
					System.out.println("["+ i + "] : " + elem[i]);
				}
				
				System.out.println("Introduce el valor entero a buscar: ");
				x = Integer.parseInt(teclado.nextLine());
				for (int i = 0; i < 50; i++) {
					if (elem[i] == x) {
						c = c + 1;
					}
				}
				if (c > 0) {
					System.out.println("El valor se encuentra en la(s) "
							+ "posicion(es):");
					for (int i = 0; i < 50; i++) {
						if (elem[i] == x) {
							System.out.println("["+ i + "]");					
						}
					}
				} else {
					System.out.println("El valor no se encuentra");
				}
				
				 j = 1;
				 k = 0;
				while (k < 25) {
					elem2[k] = elem[j];
					j = j + 2;
					k++;
				}
				System.out.println("Los valores de las posiciones impares "
						+ "son: ");
				for (int i = 0; i < 25; i++) {
					System.out.println(elem2[i]);
				}
				
				System.out.println("Los valores multiplos de 3 de las "
						+ "posiciones impares son: ");
				for (int i = 0; i < 25; i++) {
					if (elem[i]%3 == 0) {
						System.out.println(elem[i]);
					}
				}
				
				System.out.println("Programa concluido exitosamente");
				
			} catch (java.lang.NumberFormatException e) {
				System.out.println("Error: tipo de datos no coinciden");
			} finally {
				System.out.println("¿Desea repetir?S/N");
				r = teclado.nextLine();
				if (r.equals("S") || r.equals("s")) {
					id = 0;
				} else if (r.equals("N") || r.equals("n")) {
					id = 1;
				}
			}
		} while (id == 0);
		
	}

}
