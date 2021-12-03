/**
 *@(#)Programa10.java	1.00 	29/11/2021
 */
package yo;

import java.io.IOException;
import java.util.Scanner;
/**
 * @version 1.00 29/11/2021
 * @author Jesús Guevara, Ludwicka Aguirre 
 *
 */
public class Programa10 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		Scanner teclado = new Scanner(System.in);
		int id = 0;  //para repetir en caso de exepciones
		char abc [] = new char[27]; // letras del abecedario
		abc[0] = 'A';
		abc[1] = 'B';
		abc[2] = 'C';
		abc[3] = 'D';
		abc[4] = 'E';
		abc[5] = 'F';
		abc[6] = 'G';
		abc[7] = 'H';
		abc[8] = 'I';
		abc[9] = 'J';
		abc[10] = 'K';
		abc[11] = 'L';
		abc[12] = 'M';
		abc[13] = 'N';
		abc[14] = 'Ñ';
		abc[15] = 'O';
		abc[16] = 'P';
		abc[17] = 'Q';
		abc[18] = 'R';
		abc[19] = 'S';
		abc[20] = 'T';
		abc[21] = 'U';
		abc[22] = 'V';
		abc[23] = 'W';
		abc[24] = 'X';
		abc[25] = 'Y';
		abc[26] = 'Z';
		int n; //numero que introduce el usuario
		String r; //respuesta de si desea repetir o no 
		System.out.println("Programa que imprime las letras del abecedario "
				+ "dado un numero N");
		do {
			try{
				System.out.println("Introduce el valor de N, "
						+ "debe de ser entero: ");
				n = Integer.parseInt(teclado.nextLine());
				if (n >= 1 && n <= 27) {
					n = n-1;
					for (int i = 0; i <= n; i++) {
						System.out.println(abc[i]);
					}
					id = 1;
				} else {
					System.out.println("Error: el numero debe de ser entre "
							+ "1 y 27");
					id = 0;
				}
			} catch (java.lang.NumberFormatException e) {
					System.out.println("Error: tipo de dato no coincide");
					id = 0;
			} 
		} while (id==0);
	}

}
