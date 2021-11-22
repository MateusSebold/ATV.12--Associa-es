package CARRO;

public class pessoa {
	private String nome;
	private String endereço;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length()>0)
			this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		if(nome.length()>0)
			this.endereço = endereço;
	}
	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", endereço=" + endereço + ", getNome()=" + getNome() + ", getEndereço()="
				+ getEndereço() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	}
	
	
	
	
	


