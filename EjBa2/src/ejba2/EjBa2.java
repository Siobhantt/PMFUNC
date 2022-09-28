package ejba2;

import java.util.Scanner;

public class EjBa2 {

	public static void main(String[] args) {
		//Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
		//Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos) de cada semestre para cada fruta.
		//La aplicación mostrará el importe total sabiendo que 
		//el precio del kilo de manzanas está fijado en 2,35€ y el kilo de peras en 1,95€. Utiliza operadores opera y asigna.

		//Declaramos las variables que vamos a necesitar
		
		final double KGMANZANA = 2.35;
		final double KGPERA = 1.95;
		double KgPeraUser;
		double KgManzanaUser;
		
		//declaramos el Scanner
		
		Scanner leer = new Scanner(System.in);
		//Un semetre equivale a 6 meses
		
		//Solicitamos al usuario que introduzca los kilos que ha vendido y lo asignamos a las variables correspondientes
		
		System.out.println("Por favor introduzca el numero de kg de PERAS vendidos en el ultimo semestre: ");
		KgPeraUser = leer.nextDouble();
		
		System.out.println("Por favor introduzca el numero de kg de MANZANAS vendidos en el ultimo semestre: ");
		KgManzanaUser = leer.nextDouble();
		
		//Procedemos a hacer las operaciones con el opera y asigna 
		
		KgPeraUser *= KGPERA;
		KgManzanaUser *= KGMANZANA;
		
		System.out.println("El total vendido de PERAS es: " + KgPeraUser);
		System.out.println("El total vendido de MANZANAS es: " + KgManzanaUser);
		System.out.println("El total de las peras y las manzanas es: " + (KgManzanaUser + KgPeraUser));
		
		
		
		leer.close();
		
		//
		
		
		// TODO Auto-generated method stub

	}

}
