
public class banco {

	public int numeroAgencias;
	public int codigo;
	public String nomeBanco;
	
	
	public int getNumeroAgencias() {
		return numeroAgencias;
	}
	public void setNumeroAgencias(int numeroAgencias) {
		this.numeroAgencias = numeroAgencias;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	
	@Override
	public String toString() {
		return "banco [numeroAgencias=" + numeroAgencias + ", codigo=" + codigo + ", nomeBanco=" + nomeBanco + "]";
	}
	
	
}
