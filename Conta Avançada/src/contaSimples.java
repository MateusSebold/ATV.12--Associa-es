
public class contaSimples extends contaBancaria {
	
	
	public contaSimples(int agencia,int numeroDaConta,double saldo,double valorD,double valorS) {
		super(agencia,numeroDaConta,saldo,valorD, valorS);
		saldoPoupan�a = saldo;
	}
	private double saldoPoupan�a;

	public double getSaldoPoupan�a() {
		return saldoPoupan�a;
	}

	public void setSaldoPoupan�a(double saldoPoupan�a) {
		this.saldoPoupan�a = saldoPoupan�a;
		
	}
	
	
	
	
	
	
	
}
