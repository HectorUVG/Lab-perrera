/******************************************************************
SimuladorPerreraIncompleto.java
Autor: Tomás Gálvez P.
Última modificación: 2020-07-14

Driver program que implementa el menú de opciones para el simulador
que entrenará voluntari@s.
******************************************************************/
import java.util.Scanner;

class SimuladorPerrera{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//Crear perro y persona
		int opcion = 0;
		
		while (opcion != 5){
		
			System.out.println("\n\nBienvenido al simulador de entrenamiento de voluntari@s. ¿Qué hará?");
			System.out.println("1. Nueva persona");
			System.out.println("2. Nuevo perro");
			System.out.println("3. Sacar galleta");
			System.out.println("4. Interactuar");
			System.out.println("5. Salir\n\n");
			
			opcion = scan.nextInt();
			
			if (opcion == 1){
				//Nueva persona
			} else if (opcion == 2){
				//Nuevo perro
			} else if (opcion == 3){
				//Sacar galleta
			} else if (opcion == 4){
				//Interactuar
			} else if (opcion == 5){
				//Salir
			}
		}
	}
}