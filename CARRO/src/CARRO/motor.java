package CARRO;

public class motor {

	
		private String marca;
		private float potencia;
		private int cilindros;
		private String combustivel;
		
		
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			if (marca.length() > 0)
				this.marca = marca;
		}
		public float getPotencia() {
			return potencia;
		}
		public void setPotencia(float potencia) {
			if (potencia > 0)
				this.potencia = potencia;
		}
		public int getCilindros() {
			return cilindros;
		}
		public void setCilindros(int cilindros) {
			if (cilindros > 0)
				this.cilindros = cilindros;
		}
		public String getConbustivel() {
			return combustivel;
		}
		public void setConbustivel(String combustivel) {
			if (combustivel.length() > 0)
				this.combustivel = combustivel;
		}
		@Override
		public String toString() {
			return "motor [marca=" + marca + ", potencia=" + potencia + ", cilindros=" + cilindros + ", combustivel="
					+ combustivel + "]";
		}
		
		
		
}
