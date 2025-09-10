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
				
			} else if (opcion==4) {
				
			} else if (opcion==5) {
			
			} else if (opcion==6) {
				break;
			}
			
		} while (opcion<6&&opcion>0);
		

		
		

		
		//Parte 3
		System.out.println("Introduce un texto: ");
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
		
//		if(texto.isEmpty()) {
//			contadorEspacios=0;
//		}
		
		System.out.println("Vocales="+totalVocales);
		System.out.println("Paralabras="+contadorEspacios+1);
		
		for (int i = texto.length()-1 ; i > -1 ; i--) {
			System.out.print(texto.charAt(i));
		}
		
		//Parte 4
		System.out.println();
		System.out.println("Introduce el tamaño de un array: ");
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
		//Parte 5
		
		System.out.println("Intruduce un número y te digo si es primo o no");
		scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("El número es primo="+Utilidades.esPrimo(num));
		


		
	}

}
