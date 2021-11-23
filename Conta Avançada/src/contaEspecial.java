
public class contaEspecial extends contaBancaria {

	private int diaSemJuros;
	private double limite;
	
	public contaEspecial(int agencia,int numeroDaConta,double saldo,double valorD,double valorS) {
		super(agencia,numeroDaConta,saldo,valorD, valorS);
		
	}
	
	public int getDiaSemJuros() {
		return diaSemJuros;
	}
	public void setDiaSemJuros(int diaSemJuros) {
		this.diaSemJuros = diaSemJuros;
		
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
	
}
