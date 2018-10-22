
public class Automovel extends Veiculo {

	/**
	 * Sobrescrevendo o Metodo de Veiculo para o Automovel
	 */
	
	@Override
	public void ligar() {
		ligado = true;
		System.out.println("Automovel Ligado!");
	}
	
	@Override
	public void desligar() {
		ligado = false;
	System.out.println("Automovel Desligado!");
	}
	
}
