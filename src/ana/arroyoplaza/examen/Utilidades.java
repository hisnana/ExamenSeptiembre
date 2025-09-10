package ana.arroyoplaza.examen;

import java.util.Scanner;

public class Utilidades {
	//Parte 5
	public static boolean esPrimo(int x) {
		boolean esPrimo = false;
		if (x%2==0&&x>1) {
			esPrimo = true;
		}
		return esPrimo;
	}
	 public static String normalizaEspacios(String s) {
		 s= s.trim();
		 String texto ="";
		for (int i = 0 ; i < s.length()-1 ; i++) {
			String letra =s.substring(i, i+1);
			if(letra==" "&&" "==s.substring(i+1, i+2)) {
				continue;
			} else {
				texto+=letra;
			}
			
			
		}
		 return texto;
	 }
	 
	 public static void validNum() {
			//Parte 1
			System.out.println("Introduce un número: ");
			Scanner scan = new Scanner(System.in);
			scan = new Scanner(System.in);
			int numero = scan.nextInt();
			
			if(numero%2==0) {
				System.out.print("PAR ");
			}
			if (numero%2!=0) {
				System.out.print("IMPAR ");
			} 
			if (numero<0) {
				System.out.print("NEGATIVO ");
			}
	 }
	 
	 public static void estadistica() {
		//Parte 2
			System.out.println();
			System.out.println("Introduce una cantidad: ");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int totalNum = 0;
			int numMin = 0;
			int numMax = 0;

			if (n>0) {
				for(int i = 0; i<n ; i++) {
					System.out.println("Intruduce el "+(i+1)+"º número");
					int num = scan.nextInt();
					totalNum+=num;
					
					if (i==0) {
						numMin = num;
						numMax = num;
					}
					
					if (num<numMin) {
						numMin = num ;
					}
					
					if (num>numMax) {
						numMax = num;
					}
					
				}
				
				System.out.println("Suma: "+totalNum+" Min= "+numMin+" Max= "+numMax);
			} else {
				System.out.println("El dato introducido no es correcto");
			}
	 }
	
}
