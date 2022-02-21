package ExSobrecarga;

public class Quadrilatero {

	private double altura;
	private double lado1;
	private double lado2;	
	private double baseMaior;
	private double baseMenor;
	
	public Quadrilatero(double lado1) {
		this.lado1 = lado1;
	}

	public Quadrilatero(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public Quadrilatero(double baseMenor, double baseMaior, double altura) {
		this.altura = altura;
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
	}
	
	public void calculaArea(double lado1) {
		
		System.out.println("�rea do Quadrado: " + lado1 * lado1);
	}
	
	public void calculaArea(double lado1, double lado2 ) {
		
		System.out.println("�rea do Ret�ngulo: " + lado1 * lado2);
	}
	
	public void calculaArea(double baseMenor, double baseMaior, double altura) {
		
		System.out.println("�rea do Trap�zio: " + ((baseMaior + baseMenor) * altura) / 2);
	}
			
}
