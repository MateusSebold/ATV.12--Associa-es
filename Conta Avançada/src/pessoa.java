
public class pessoa {

	
	private String nome;
	private String endere�o;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		nome = "DomQuixote";
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
		endere�o = "Rua Dos Bobos,0";
	}
	
	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", endere�o=" + endere�o + "]";
	}
	
	
	
	
}
