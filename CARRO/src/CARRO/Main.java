package CARRO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carro pm =  new carro();
		pm.dono.setNome("Mateus");
		pm.dono.setEndere�o("Rua de Fogo,130");
		pm.pe�aMotor.setMarca("Nissan");
		pm.pe�aMotor.setPotencia(400);
		pm.pe�aMotor.setCilindros(8);
		pm.pe�aMotor.setConbustivel("Gasolina");
		pm.setAno(2000);
		pm.setCor("Azul");
		pm.setModelo("SkyLine");
		pm.setFabricante("Toshiba");
		System.out.println((pm));
		
		
	}

}
