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
	 
	 public static void analisisTexto() {
		 
			//Parte 3
			System.out.println("Introduce un texto: ");
			Scanner scan = new Scanner(System.in);
			scan = new Scanner(System.in);
			String texto = scan.nextLine();
			texto=Utilidades.normalizaEspacios(texto);
			int totalVocales = 0;
			int contadorEspacios = 0; 
			
			for (int i = 0 ; i < texto.length() ; i++) {
				char letra =texto.trim().toLowerCase().charAt(i);
				if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u') {
					totalVocales++;
				}
				if (letra==' ') {
					contadorEspacios++;
				}
				
			}
			
//			if(texto.isEmpty()) {
//				contadorEspacios=0;
//			}
			
			System.out.println("Vocales="+totalVocales);
			System.out.println("Paralabras="+contadorEspacios+1);
			
			for (int i = texto.length()-1 ; i > -1 ; i--) {
				System.out.print(texto.charAt(i));
			}
			
	 }
	 
	 public static void operacionesArray() {
		//Parte 4
			System.out.println();
			System.out.println("Introduce el tamaño de un array: ");
			Scanner scan = new Scanner(System.in);
			scan = new Scanner(System.in);
			
			int m = scan.nextInt();
			if (m>0) {
				int[] array = new int[m];
				
				for(int i = 0; i < array.length ; i++) {
					System.out.println("Intruduce el "+(i+1)+"º número");
					scan = new Scanner(System.in);
					int num = scan.nextInt();
					
				}
				//Eliminar duplicados
				int contador = 0;
				for (int i = 0 ; i < m ; i ++) {
					for (int j = 0 ; j < m ; j ++) {
						if (i!=j&&array[i]!=array[j]) {
							contador++;
						}
					}
					
				}
				int[] sinDuplicados= new int[contador];
				for (int i = 0 ; i < m ; i ++) {
					for (int j = 0 ; j < contador ; j ++) {
						if (array[i]!=sinDuplicados[j]) {
							sinDuplicados[i]= array[i];
						}
					}
					
				}
				System.out.println("SinDuplicados=");
				for (int num : sinDuplicados) {
					System.out.print(num+" ");
				}
				System.out.println();
				System.out.println("Intruduce un número para ver si existe");
				scan = new Scanner(System.in);
				int k = scan.nextInt();
				boolean existe = false;
				System.out.println("Indices(k="+k+")=");
				
				for (int i = 0 ; i<m; i++) {
					
					if(k==array[i]) {
						
						System.out.print(+i+" ");
						existe = true;
					}
				}
				
				if (existe==false) {
					System.out.println("NO_ENCONTRADO");
				}


			}else {
				System.out.println("El número debe ser mayor que 0");
			}
	 }
	 
	 public static void comprobarPrimo(){
			//Parte 5
			
			System.out.println("Intruduce un número y te digo si es primo o no");
			Scanner scan = new Scanner(System.in);
			scan = new Scanner(System.in);
			int num = scan.nextInt();
			System.out.println("El número es primo="+Utilidades.esPrimo(num));
			

	 }
}
