package CARRO;

public class carro {
	
	private String fabricante; 
	private String modelo;
	private String cor;
	private int ano;
	
	
	protected motor peçaMotor;
	protected pessoa dono;
	
	
	
	public motor getPeçaMotor() {
		return peçaMotor;
	}
	public void setPeçaMotor(motor peçaMotor) {
		this.peçaMotor = peçaMotor;
	}
	public pessoa getDono() {
		return dono;
	}
	public void setDono(pessoa dono) {
		this.dono = dono;
	}
	
	
	public carro() {
		peçaMotor = new motor();
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
				+ ", peçaMotor=" + peçaMotor + ", dono=" + dono + "]";
	}
	
	
	
}
