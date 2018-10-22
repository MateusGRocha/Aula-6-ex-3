
public class Onibus extends Veiculo {
	
	/**
	 * Sobrescrevendo o Metodo de Veiculo para o Onibus
	 */
	
	@Override
	public void ligar() {
		ligado = true;
		System.out.println("Onibus Ligado!");
	}
	
	@Override
	public void desligar() {
		ligado = false;
		System.out.println("Onibus Desligado!");
	}

}
