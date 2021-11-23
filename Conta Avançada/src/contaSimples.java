
public class contaSimples extends contaBancaria {
	
	
	public contaSimples(int agencia,int numeroDaConta,double saldo,double valorD,double valorS) {
		super(agencia,numeroDaConta,saldo,valorD, valorS);
		saldoPoupança = saldo;
	}
	private double saldoPoupança;

	public double getSaldoPoupança() {
		return saldoPoupança;
	}

	public void setSaldoPoupança(double saldoPoupança) {
		this.saldoPoupança = saldoPoupança;
		
	}
	
	
	
	
	
	
	
}
