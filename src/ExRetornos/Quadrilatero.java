package ExRetornos;

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
	
	public double calculaArea(double lado1) {
		
		return lado1 * lado1;
	}
	
	public double calculaArea(double lado1, double lado2 ) {
		
		return lado1 * lado2;
	}
	
	public double calculaArea(double baseMenor, double baseMaior, double altura) {
		
		return ((baseMaior + baseMenor) * altura) / 2;
	}
	
	
}
