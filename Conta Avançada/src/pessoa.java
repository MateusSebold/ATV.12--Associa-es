
public class pessoa {

	
	private String nome;
	private String enderešo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		nome = "DomQuixote";
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
		enderešo = "Rua Dos Bobos,0";
	}
	
	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", enderešo=" + enderešo + "]";
	}
	
	
	
	
}
