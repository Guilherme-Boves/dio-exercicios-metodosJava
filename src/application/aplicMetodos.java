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
		
		/* Exerc�cio 1 - Calculadora */
		System.out.print("N�mero 1: ");
		num1 = sc.nextDouble();
		System.out.print("N�mero 2: ");
		num2 = sc.nextDouble();
		
		do {
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			
			System.out.print("Informe a op��o: ");
			op = sc.nextInt();
			
		} while(op <= 0 || op >= 5);
		
		Calculadora calc = new Calculadora(num1, num2, op);
		
		calc.calcula(num1, num2, op);		
		
		/* Exerc�cio 2 - Hora do Dia */	
		Mensagem.horaDoDia();
		
		/* Exerc�cio 3 - Calcula Empr�stimo */
		do {
			System.out.print("\nValor do Empr�stimo: ");
			valorEmprestimo = sc.nextDouble();				
			System.out.print("Quantidade de Parcelas: ");
			qtdParcelas = sc.nextInt();
			
			if (valorEmprestimo <= 0)
				System.out.println("O Valor do empr�stimo � inv�lido!");
			if (qtdParcelas <= 0) 
				System.out.println("A Quantidade de parcelas � inv�lida!");
			
		} while (valorEmprestimo <= 0 || qtdParcelas <= 0);	
		
		Emprestimo emprestimo = new Emprestimo(valorEmprestimo, qtdParcelas);		
		System.out.println("Valor final do empr�stimo para " + emprestimo.getQtdParcelas() +" parcela(s): R$" + emprestimo.calculaValorFinal(valorEmprestimo, qtdParcelas));
		
		sc.close();
	}

}
 