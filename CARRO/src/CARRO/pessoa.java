package CARRO;

public class pessoa {
	private String nome;
	private String endere�o;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length()>0)
			this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		if(nome.length()>0)
			this.endere�o = endere�o;
	}
	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", endere�o=" + endere�o + ", getNome()=" + getNome() + ", getEndere�o()="
				+ getEndere�o() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	}
	
	
	
	
	


