package CARRO;

public class pessoa {
	private String nome;
	private String enderešo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length()>0)
			this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		if(nome.length()>0)
			this.enderešo = enderešo;
	}
	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", enderešo=" + enderešo + ", getNome()=" + getNome() + ", getEnderešo()="
				+ getEnderešo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	}
	
	
	
	
	


