package entities;


public class Calculadora {

	private double num1, num2;
	private int op;
	
	
	public Calculadora(double num1, double num2, int op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	public void calcula(double n1, double n2, int op) {
		
		switch (op) {
		case 1:
			n1 = n1 + n2;
			System.out.println("\nOperação: Soma\nResultado = " + n1);
			break;
		case 2:
			n1 = n1 - n2;
			System.out.println("\nOperação: Subtração\nResultado = " + n1);
			break;			
		case 3:
			n1 = n1 * n2;
			System.out.println("\nOperação: Multiplicação\nResultado = " + n1);
			break;			
		case 4:
			n1 = n1 / n2;
			System.out.println("\nOperação: Divisão\nResultado = " + n1);	
		}		
	}
}
