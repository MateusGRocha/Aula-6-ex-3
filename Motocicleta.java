
public class Motocicleta extends Veiculo{

	/**
	 * Sobrescrevendo o Metodo de Veiculo para a Motocicleta
	 */
	
	@Override
	public void ligar() {
		ligado = true;
		System.out.println("Motocicleta Ligada!");
	}
	
	@Override
	public void desligar() {
		ligado = false;
		System.out.println("Motocicleta Desligada!");
	}
	
}
