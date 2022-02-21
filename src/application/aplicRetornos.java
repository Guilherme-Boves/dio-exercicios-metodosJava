package application;

import java.util.Scanner;

import ExRetornos.Quadrilatero;

public class aplicRetornos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercício Retornos\n");
		
		/* Calculando área de um Quadrado */
		System.out.println("Calculando área do Quadrado");
		System.out.print("Lado: ");
		double ladoQuadrado = sc.nextDouble();
		Quadrilatero quadrado = new Quadrilatero(ladoQuadrado);
		System.out.println("Área do Quadrado: " + quadrado.calculaArea(ladoQuadrado));		
		
		/* Calculando área de um Retângulo */
		System.out.println("\nCalculando área do Retângulo");
		System.out.print("Lado 1: ");
		double ladoRetangulo1 = sc.nextDouble();
		System.out.print("Lado 2: ");
		double ladoRetangulo2 = sc.nextDouble();
		Quadrilatero retangulo = new Quadrilatero(ladoRetangulo1, ladoRetangulo2);
		System.out.println("Área do Retângulo: " + retangulo.calculaArea(ladoRetangulo1, ladoRetangulo2));
		
				
		/* Calculando área de um Trapézio */
		System.out.println("\nCalculando área do Trapézio");
		System.out.print("Base Menor: ");
		double baseMenor = sc.nextDouble();
		System.out.print("Base Maior: ");
		double baseMaior = sc.nextDouble();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		Quadrilatero trapezio = new Quadrilatero(baseMenor, baseMaior, altura);
		System.out.println("Área do Trapézio: " + trapezio.calculaArea(baseMenor, baseMaior, altura));
		
		sc.close();

	}

}
