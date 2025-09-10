package ana.arroyoplaza.examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println();
			System.out.println("1. Par/Impar/Negativo\n"
					+ "2. Estadísticos\n"
					+ "3. Análisis de texto\n"
					+ "4. Operasciones con array\n"
					+ "5. Comprobar primo\n"
					+ "6. Salir");
			
			System.out.println("Introduce un número: ");
			opcion = scan.nextInt();
			if(opcion==1) {
				Utilidades.validNum();

			} else if (opcion==2) {
				Utilidades.estadistica();
				
			} else if (opcion==3) {
				Utilidades.analisisTexto();
				
			} else if (opcion==4) {
				Utilidades.operacionesArray();
			} else if (opcion==5) {
				Utilidades.comprobarPrimo();
			
			} else if (opcion==6) {
				break;
			}
			
		} while (opcion<6&&opcion>0);
		


		
	}

}
