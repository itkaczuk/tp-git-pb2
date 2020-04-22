package ar.edu.unlam.pb2.tp1;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Integer a = 0;
		Integer b = 0;
		Integer opcion = 0;
		Integer resultado = 0;
		Scanner teclado = new Scanner(System.in);
		
		do{
			 opcion = seleccionarOpcion();
			switch (opcion) {
			case 1: restar();
				break;
			case 2: 
				resultado = sumar();
				break;
			case 3:
				resultado = dividir();
				break;
			case 4:
				resultado = multiplicar();
				break;
			case 9:
				break;
			default:
				System.out.println("Opción Invalida");
				break;
			}
		} while (opcion != 9);

	}

	
	private static Integer seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada=0;

		System.out.println("************************");
		System.out.println("Menu calculadora");
		System.out.println("1 - Restar");
		System.out.println("2 - Sumar");
		System.out.println("3 - Dividir");
		System.out.println("4 - Multiplicar");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		
		opcionSeleccionada = teclado.nextInt();
		
		return opcionSeleccionada;
	}
	
	private static Integer sumar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = teclado.nextInt();
		int resultado = a + b;
		return resultado;	
	}
	private static Integer restar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = teclado.nextInt();
		int resultado = a - b;
		return resultado;	
	}
	
	private static Integer multiplicar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = teclado.nextInt();
		int resultado = a * b;
		return resultado;	
	}
	
	private static Integer dividir() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = teclado.nextInt();
		int resultado = a / b;
		return resultado;	
	}

	
}

		
