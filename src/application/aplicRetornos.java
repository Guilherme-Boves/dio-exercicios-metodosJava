package application;

import java.util.Scanner;

import ExRetornos.Quadrilatero;

public class aplicRetornos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exerc�cio Retornos\n");
		
		/* Calculando �rea de um Quadrado */
		System.out.println("Calculando �rea do Quadrado");
		System.out.print("Lado: ");
		double ladoQuadrado = sc.nextDouble();
		Quadrilatero quadrado = new Quadrilatero(ladoQuadrado);
		System.out.println("�rea do Quadrado: " + quadrado.calculaArea(ladoQuadrado));		
		
		/* Calculando �rea de um Ret�ngulo */
		System.out.println("\nCalculando �rea do Ret�ngulo");
		System.out.print("Lado 1: ");
		double ladoRetangulo1 = sc.nextDouble();
		System.out.print("Lado 2: ");
		double ladoRetangulo2 = sc.nextDouble();
		Quadrilatero retangulo = new Quadrilatero(ladoRetangulo1, ladoRetangulo2);
		System.out.println("�rea do Ret�ngulo: " + retangulo.calculaArea(ladoRetangulo1, ladoRetangulo2));
		
				
		/* Calculando �rea de um Trap�zio */
		System.out.println("\nCalculando �rea do Trap�zio");
		System.out.print("Base Menor: ");
		double baseMenor = sc.nextDouble();
		System.out.print("Base Maior: ");
		double baseMaior = sc.nextDouble();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		Quadrilatero trapezio = new Quadrilatero(baseMenor, baseMaior, altura);
		System.out.println("�rea do Trap�zio: " + trapezio.calculaArea(baseMenor, baseMaior, altura));
		
		sc.close();

	}

}
