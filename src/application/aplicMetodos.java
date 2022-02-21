package application;

import java.util.Scanner;

import ExMetodos.Calculadora;
import ExMetodos.Emprestimo;
import ExMetodos.Mensagem;

public class aplicMetodos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, valorEmprestimo;
		int op, qtdParcelas;
		
		/* Exercício 1 - Calculadora */
		System.out.print("Número 1: ");
		num1 = sc.nextDouble();
		System.out.print("Número 2: ");
		num2 = sc.nextDouble();
		
		do {
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			
			System.out.print("Informe a opção: ");
			op = sc.nextInt();
			
		} while(op <= 0 || op >= 5);
		
		Calculadora calc = new Calculadora(num1, num2, op);
		
		calc.calcula(num1, num2, op);		
		
		/* Exercício 2 - Hora do Dia */	
		Mensagem.horaDoDia();
		
		/* Exercício 3 - Calcula Empréstimo */
		do {
			System.out.print("\nValor do Empréstimo: ");
			valorEmprestimo = sc.nextDouble();				
			System.out.print("Quantidade de Parcelas: ");
			qtdParcelas = sc.nextInt();
			
			if (valorEmprestimo <= 0)
				System.out.println("O Valor do empréstimo é inválido!");
			if (qtdParcelas <= 0) 
				System.out.println("A Quantidade de parcelas é inválida!");
			
		} while (valorEmprestimo <= 0 || qtdParcelas <= 0);	
		
		Emprestimo emprestimo = new Emprestimo(valorEmprestimo, qtdParcelas);		
		System.out.println("Valor final do empréstimo para " + emprestimo.getQtdParcelas() +" parcela(s): R$" + emprestimo.calculaValorFinal(valorEmprestimo, qtdParcelas));
		
		sc.close();
	}

}
 