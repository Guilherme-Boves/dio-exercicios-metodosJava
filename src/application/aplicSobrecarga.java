package application;

import java.util.Scanner;

import ExSobrecarga.Quadrilatero;

public class aplicSobrecarga {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Calculando �rea de um Quadrado */
		System.out.println("Calculando �rea do Quadrado");
		System.out.print("Lado: ");
		double ladoQuadrado = sc.nextDouble();
		Quadrilatero quadrado = new Quadrilatero(ladoQuadrado);
		quadrado.calculaArea(ladoQuadrado);
		
		/* Calculando �rea de um Ret�ngulo */
		System.out.println("\nCalculando �rea do Ret�ngulo");
		System.out.print("Lado 1: ");
		double ladoRetangulo1 = sc.nextDouble();
		System.out.print("Lado 2: ");
		double ladoRetangulo2 = sc.nextDouble();
		Quadrilatero retangulo = new Quadrilatero(ladoRetangulo1, ladoRetangulo2);
		retangulo.calculaArea(ladoRetangulo1, ladoRetangulo2);
				
		/* Calculando �rea de um Trap�zio */
		System.out.println("\nCalculando �rea do Trap�zio");
		System.out.print("Base Menor: ");
		double baseMenor = sc.nextDouble();
		System.out.print("Base Maior: ");
		double baseMaior = sc.nextDouble();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		Quadrilatero trapezio = new Quadrilatero(baseMenor, baseMaior, altura);
		trapezio.calculaArea(baseMenor, baseMaior, altura);
		
		sc.close();

	}

}
