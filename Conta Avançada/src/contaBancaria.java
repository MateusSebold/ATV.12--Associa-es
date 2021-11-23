import java.util.ArrayList;

public class contaBancaria {

	private int agencia;
	private int numeroDaConta;
	private double saldo;
	
	
	
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia>0)
			this.agencia = agencia;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		if(numeroDaConta>0)
			this.numeroDaConta = numeroDaConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo<0||saldo>0)
			this.saldo = saldo;
	}
	
	public contaBancaria(int agencia, int numeroDaConta, double saldo,double valorD,double valorS) {
		this.agencia = agencia;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		this.valorD = valorD;
		this.valorS = valorS;
		
		
	}
	
	
	private ArrayList<pessoa>correntista;
	
	public void adiciona(pessoa Pessoa) {
		this.correntista.add(Pessoa);
	}
	
	private ArrayList<banco>banco;
	
	public void adiciona(banco Banco) {
		this.banco.add(Banco);
	}
	
	
	
	
	public ArrayList<pessoa> getCorrentista() {
		return correntista;
	}
	public void setCorrentista(ArrayList<pessoa> correntista) {
		this.correntista = correntista;
	}
	public ArrayList<banco> getBanco() {
		return banco;
	}
	public void setBanco(ArrayList<banco> banco) {
		this.banco = banco;
	}
	
	private  boolean deposito;
	private boolean saque;
	private double valorS;
	private double valorD;
	
				
	
	
	
	
	public double getValorS() {
		return valorS;
	}
	public void setValorS(double valorS) {
		this.valorS = valorS;
	}
	public double getValorD() {
		return valorD;
	}
	public void setValorD(double valorD) {
		this.valorD = valorD;
	}
	
	
	public boolean isDeposito() {
		return deposito;
	}
	public void setDeposito(boolean deposito) {
		if(getValorD()>0)
			this.deposito = deposito;
			setSaldo(getSaldo()+getValorD());
			setDeposito(true);
		
	}
	public boolean isSaque() {
		return saque;
	}
	public void setSaque(boolean saque) {
		
		if(valorS>0&&saldo>=valorS)
			this.saque = saque;
			setSaque(true);
			setSaldo(getSaldo()+getValorS());
			
	}
	@Override
	public String toString() {
		return "contaBancaria [agencia=" + agencia + ", numeroDaConta=" + numeroDaConta + ", saldo=" + saldo
				+ ", correntista=" + correntista + ", banco=" + banco + "]";
	}
	
	
	
	}
	
	
		
	



