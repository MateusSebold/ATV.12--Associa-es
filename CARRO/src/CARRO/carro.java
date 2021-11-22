package CARRO;

public class carro {
	
	private String fabricante; 
	private String modelo;
	private String cor;
	private int ano;
	
	
	protected motor pe�aMotor;
	protected pessoa dono;
	
	
	
	public motor getPe�aMotor() {
		return pe�aMotor;
	}
	public void setPe�aMotor(motor pe�aMotor) {
		this.pe�aMotor = pe�aMotor;
	}
	public pessoa getDono() {
		return dono;
	}
	public void setDono(pessoa dono) {
		this.dono = dono;
	}
	
	
	public carro() {
		pe�aMotor = new motor();
		dono = new pessoa();
		
	}
	
	
	
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		if (fabricante.length() > 0)
			this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo.length() > 0)
			this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		if (cor.length() > 0)
			this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if (ano > 1890)
			this.ano = ano;
	}
	
	
		
	
	
	@Override
	public String toString() {
		return "carro [fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor + ", ano=" + ano
				+ ", pe�aMotor=" + pe�aMotor + ", dono=" + dono + "]";
	}
	
	
	
}
