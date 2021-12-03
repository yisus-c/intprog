/**
 * @(#)Programa4.java	1.00 	01/12/2021
 */
package yo;
import java.io.IOException;
import java.util.Scanner;
/**
 * @version 1.00 01/12/2021
 * @author Jesús Guevara, Ludwicka Aguirre
 *
 */
public class Programa4 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int cantidadCiudades;  //guarda la cantidad de ciudades
		int ni; //para aumentar el valor de i en 1
		int nni; //para aumentar el valor de j o j2 e 1
		int ventasEmpleados; //calcula las suma de las ventas de todos los empleados de una tienda
		int ventaCiudad; // calcula la suma de las ventas de todas las tiendas de una ciudad
		int venta; //guarda la venta que hizo un empleado, se borra cada ciclo
		int ventaTotal = 0; //calcula la suma de las ventas de todas las ciudades
		int id = 0; 
		String r; // respuesta de si desea repetir o no
		
		do {
			try {
				System.out.println("Introduce la cantidad de CIUDADES: ");
				cantidadCiudades = Integer.parseInt(teclado.nextLine());
				int cantidadTiendas[] = new int [cantidadCiudades]; // guarda la cantidad de tiendas que hay por ciudad
				int cantidadEmpleados[][] = new int [cantidadCiudades][]; //guarda la cantidad de empleados que hay por cada tienda por cada ciudad
				int ventasTiendas[][] = new int [cantidadCiudades][]; //guarda las ventas de cada tienda de cada ciudad
				int ventasCiudad[] = new int [cantidadCiudades]; // guarda las ventas de cada ciudad
		 		String nombresCiudades [] = new String [cantidadCiudades];
				for (int i = 0; i < cantidadCiudades; i++) {
					ni = i + 1;
					System.out.println("Introduce el NOMBRE de la ciudad " + ni +" :");
					nombresCiudades[i] = teclado.nextLine();
				}
				ni = 0;
				for (int i = 0; i < cantidadCiudades; i++) {
					System.out.println("Intoduce la cantidad de TIENDAS que hay en "
							+ nombresCiudades[i] + " :");
					cantidadTiendas[i] = Integer.parseInt(teclado.nextLine());
				}
				
				for (int i = 0; i < cantidadCiudades; i++) {
					ventasTiendas[i] = new int [cantidadTiendas[i]];
					cantidadEmpleados[i] = new int [cantidadTiendas[i]];
					ventaCiudad = 0;
					for (int j = 0; j < cantidadTiendas[i]; j++) {
						ni = j + 1;
						System.out.println("Introduce la cantidad de EMPLEADOS que "
								+ "hay en la tienda #" + ni + " de " 
								+ nombresCiudades[i] + ": ");
						cantidadEmpleados[i][j] = Integer.parseInt(teclado.nextLine());
						ventasEmpleados = 0;
						for (int j2 = 0; j2 < cantidadEmpleados[i][j]; j2++) {
							nni = j2 + 1;
							System.out.println("Introduce la VENTA del empleado " 
									+ nni + " de la tienda #" + ni + " de " 
									+ nombresCiudades[i]);
							venta = Integer.parseInt(teclado.nextLine());
							ventasEmpleados = ventasEmpleados + venta;
						}
						ventasTiendas[i][j] = ventasEmpleados;
						ventaCiudad = ventasTiendas[i][j] + ventaCiudad;
					}
					ventasCiudad[i] = ventaCiudad;
					ventaTotal = ventaTotal + ventasCiudad[i];
				}
				nni = 0;
				System.out.println("La venta total de la cadena es de: " + ventaTotal);
				for (int i = 0; i < cantidadCiudades; i++) {
					System.out.println("|---> La venta total de " + nombresCiudades[i] 
							+ " es de : " + ventasCiudad[i]);
					for (int j = 0; j < cantidadTiendas[i]; j++) {
						nni = j + 1;
						System.out.println("|     |---- La venta de la tienda #" + nni 
								+ " de " + nombresCiudades[i] + " fue de : " 
								+ ventasTiendas[i][j]);
					}
				}
				System.out.println();
				System.out.println("Programa completado con exito");
			} catch (java.lang.NumberFormatException e) {
				System.out.println("Error: tipo de datos no coinciden");
			} finally{
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
