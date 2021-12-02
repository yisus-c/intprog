/**
 * @(#)Programa13.java	1.00 	30/11/2021
 */
package yo;
import java.io.IOException;
import java.util.Scanner;
/**
 * @version 1.00 30/11/2021
 * @author Jesús Guevara, Ludwicka Aguirre
 * La clase Programa13 se trata de un algoritmo que permita introducir n 
 * elementos de tipo entero en un arreglo, el programa mostrara impreso el 
 * arreglo en orden inverso a como fueron introducidos.
 */
public class Programa13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner (System.in);
		int n = 0;
		int id = 0;
		String r;
		System.out.println("Programa para mostrar un arreglo de n elementos"
				+ "en orden inverso");
		do {
			try {
				System.out.println("Introduce la cantidad entera de elementos "
						+ "del arreglo: ");
				n = Integer.parseInt(teclado.nextLine());
				if(n>0){
					int elem[] = new int [n];
					for (int i = 0; i < elem.length; i++) {
						System.out.println("Introduce el valor entero del "
								+ "elemento [" + i +"]: ");
						elem[i] = Integer.parseInt(teclado.nextLine());
					}
					System.out.println("El arrelgo en orden inverso es: ");
					for (int i = elem.length; i > 0; i--) {
						System.out.println(elem[i-1]);
					}
					id = 1;
				} else {
					System.out.println("Error: El numero debe de ser "
							+ "mayor a 0");
					id = 0;
				}
			} catch (java.lang.NumberFormatException e){
				System.out.println("Error: tipo de dato no coincide");
			} finally {
				System.out.println("¿Desea repetir?S/N");
				r = teclado.nextLine();
				if(r.equals("S") || r.equals("s")){
					id = 0;
				}
				if(r.equals("N") || r.equals("n")){
					id = 1;
				}
			}
		} while (id==0);
	}

}
