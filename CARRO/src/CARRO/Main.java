package CARRO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carro pm =  new carro();
		pm.dono.setNome("Mateus");
		pm.dono.setEndereço("Rua de Fogo,130");
		pm.peçaMotor.setMarca("Nissan");
		pm.peçaMotor.setPotencia(400);
		pm.peçaMotor.setCilindros(8);
		pm.peçaMotor.setConbustivel("Gasolina");
		pm.setAno(2000);
		pm.setCor("Azul");
		pm.setModelo("SkyLine");
		pm.setFabricante("Toshiba");
		System.out.println((pm));
		
		
	}

}
