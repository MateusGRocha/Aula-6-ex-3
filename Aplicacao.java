
public class Aplicacao {

	public static void main(String[] args) {

		//instanciando novos Automoveis
		Automovel auto = new Automovel();
		Motocicleta moto = new Motocicleta();
		Onibus oni = new Onibus();
	
		//Mudando o estado deles
		auto.ligar();
		moto.desligar();
		oni.ligar();
		
		//imprimindo o resultado
		System.out.println(auto.isLigado());
		System.out.println(moto.isLigado());
		System.out.println(oni.isLigado());
	
	}

}
