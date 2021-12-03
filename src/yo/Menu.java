/**
 * @(#)Menu.java	1.10 	03/12/2021
 */
package yo;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
/**
 * @version 1.10 03/12/2021
 * @author Jesús Guevara, Ludwicka Aguirre
 */
public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		int fstid = 0; //id del do while del menú
		int op; //opcion del menú
		Scanner fstteclado = new Scanner(System.in); //entrada del menú
		Scanner teclado = new Scanner (System.in);
		String r; //respuesta de si desea repetir o no 
		int id = 0; 
		int n; //numero que introduce el usuario
		int x; 
		do {
			try {
				System.out.println("********************************Menú*******************************");
				System.out.println("Programas disponibles: ");
				System.out.println("4.- Programa que genera un reporte de ventas "
						+ "de una cadena de tiendas de autoservicio.");
				System.out.println("10.- Programa que imprime las letras del abecedario "
						+ "dado un numero N");
				System.out.println("11.- Programa para mostrar el histograma de datos "
						+ "de un arrego");
				System.out.println("13.- Programa para mostrar un arreglo de n elementos "
						+ "en orden inverso");
				System.out.println("16.- Programa para invertir los elementos de un arreglo "
						+ "y guardar el nuevo orden en otro arreglo");
				System.out.println("17.- Programa que imprime un vector, busca un valor"
						+ " dado por el usurio, imprime las posiciones impares e "
						+ " imprime los multiplos de 3 de las posiciones impares");
				System.out.println("Introduce el numero del programa de la lista"
						+ " que desees ejecutar: ");
				System.out.println("(escriba 0 para salir)");
				op = Integer.parseInt(fstteclado.nextLine());
				fstid = 1;
				switch (op) {
				case 0:
					System.out.println("Programa concluido");
					fstid=1;
					break;
				case 4:
					
					int cantidadCiudades;  //guarda la cantidad de ciudades
					int ni; //para aumentar el valor de i en 1
					int nni; //para aumentar el valor de j o j2 e 1
					int ventasEmpleados; //calcula las suma de las ventas de todos los empleados de una tienda
					int ventaCiudad; // calcula la suma de las ventas de todas las tiendas de una ciudad
					int venta; //guarda la venta que hizo un empleado, se borra cada ciclo
					int ventaTotal = 0; //calcula la suma de las ventas de todas las ciudades
					id = 0; 
					
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
					break;
				
				case 10:
					//Scanner teclado = new Scanner(System.in);
					id = 0;  //para repetir en caso de exepciones
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
					n = 0;
					
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
					break;
				
				case 11:
					id = 0;
					n = 0;
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
							if(r.equals("S") || r.equals("s")) {
								id = 0;
							}
							else if(r.equals("N") || r.equals("n")) {
								id = 1;
							}
						}
					} while (id == 0);
					break;	
				
				case 13:
					n = 0;
					id = 0;
					System.out.println("Programa para mostrar un arreglo de n elementos"
							+ "en orden inverso");
					do {
						try {
							System.out.println("Introduce la cantidad entera de elementos "
									+ "del arreglo: ");
							n = Integer.parseInt(teclado.nextLine());
							if (n > 0) {
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
							if (r.equals("S") || r.equals("s")) {
								id = 0;
							} else if (r.equals("N") || r.equals("n")) {
								id = 1;
							}
						}
					} while (id==0);
					break;
				
				case 16:
					x = 0; //cantidad de elementos que introducira el usuario
					int np; //nueva posicion del arreglo
					System.out.println("Programa para invertir los elementos de un "
							+ "arreglo y guardar el nuevo orden en otr arreglo");
					do {
						try {
							System.out.println("Introduce la cantidad entera de "
									+ "elementos: ");
							x = Integer.parseInt(teclado.nextLine());				
							if (x > 0) {
								int elem[] = new int[x];
								for (int i = 0; i < elem.length; i++) {
									System.out.println("Introduce el valor entero del "
											+ "elemento [" + i +"]: ");
									elem[i] = Integer.parseInt(teclado.nextLine());
								}
								int nelem[] = new int[elem.length];
								for (int i = 0; i < elem.length; i++) {
									np = elem.length - i - 1;
									nelem[np] = elem[i];
								}
								System.out.println("El nuevo orden es: ");
								for (int i = 0; i < elem.length; i++) {
									System.out.println("["+i+"]: "+nelem[i]);
								}
								System.out.println("Programa completado exitosamente");
							} else{
								System.out.println("Error: el numero debe de ser "
										+ "mayor a 0");
								id = 0;
							}
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
					} while (id==0);
					break;
				
				case 17:
					int elem[] = new int[50];
					int elem2[] = new int[25];
					x = 0; //elemento que buscara el usuario
					int j = 1;
					int k = 0;
					int c = 0; // para contar cuantas veces se encuentra el valor a buscar
					Random rd = new Random();
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
					break;
					
				default:
					System.out.println("Introduce una opcion valida");
					fstid = 0;
					break;
				}
				
			} catch(Exception e){
				System.out.println("Tipo de dato no valido, intente de nuevo");
				fstid = 0;
			}
		} while (fstid == 0);
	}

}
