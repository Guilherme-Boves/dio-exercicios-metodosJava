package ExMetodos;

public class Emprestimo {

	private double valorEmprestimo;
	private double valorTaxas;
	private int qtdParcelas;
	
	
	public Emprestimo(double valorEmprestimo, int qtdParcelas) {
		this.valorEmprestimo = valorEmprestimo;		
		this.qtdParcelas = qtdParcelas;
	}
	
	
	public int getQtdParcelas() {
		return qtdParcelas;
	}

	
	public double calculaValorFinal(double valorEmprestimo, int qtdParcelas) {
				
		if (qtdParcelas > 0 && qtdParcelas < 2) {
			return valorEmprestimo;			
		} else if (qtdParcelas >= 2 && qtdParcelas < 6) {
			valorTaxas = 0.03;
			return (valorEmprestimo * valorTaxas) + valorEmprestimo;
		} else if (qtdParcelas >= 6 && qtdParcelas < 8) {
			valorTaxas = 0.06;
			return (valorEmprestimo * valorTaxas) + valorEmprestimo;		
		} else {
			valorTaxas = 0.09;
			return (valorEmprestimo * valorTaxas) + valorEmprestimo;
		}
	}
	
}
