
public class pessoa {

	
	private String nome;
	private String endereço;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		nome = "DomQuixote";
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
		endereço = "Rua Dos Bobos,0";
	}
	
	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", endereço=" + endereço + "]";
	}
	
	
	
	
}
