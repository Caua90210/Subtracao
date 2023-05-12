package br.senai.sp.jandira;

import java.util.Scanner;

public class Subtração {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("------------------------------------------------");
		System.out.println("Calculadora Subtração");
		System.out.println("------------------------------------------------");
		System.out.print("Valor 1: ");
		int valor1 = teclado.nextInt();
		System.out.print("Valor 2: ");
		int valor2 = teclado.nextInt();
		System.out.println("------------------------------------------------");
		System.out.println("Resultado");
		System.out.println("------------------------------------------------");
		
		if (valor1>valor2) {
			int valor3 = valor1 - valor2;
					System.out.println("O resultado é "+ valor3);
		}else {
			int valor4 = valor2 - valor1;
			System.out.println("O resultado é " + valor4);
		}
		
	}

}
