/**
 * @version 1.00 30/11/2021
 * @author Jesús Guevara, Ludwicka Aguirre 
 */
package yo;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author gueva
 *
 */
public class Programa11 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		int id = 0;
		String r;
		System.out.println("Programa para mostrar el histograma de datos "
				+ "de un arrego");
		do {
			try{
				System.out.println("Introduce la cantidad entera de "
						+ "elementos: ");
				n = Integer.parseInt(teclado.nextLine());
				int elem[] = new int[n];
				for (int i = 0; i < elem.length; i++) {
					System.out.println("Introduce el valor entero del elemento"
							+ " [" + i +"]: ");
					elem[i] = Integer.parseInt(teclado.nextLine());
				}
				System.out.println("El histograma es: ");
				for (int i = 0; i < elem.length; i++) {
					for (int j = 0; j < elem[i]; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				id = 1;
			} catch(java.lang.NumberFormatException e){
				System.out.println("Error: Tipo de dato no valido");
			} finally{
				System.out.println("¿Desea repetir?S/N");
				r = teclado.nextLine();
				if(r.equals("S") || r.equals("s")){
					id = 0;
				}
				if(r.equals("N") || r.equals("n")){
					id = 1;
				}
			}
		} while (id == 0);

	}

}
