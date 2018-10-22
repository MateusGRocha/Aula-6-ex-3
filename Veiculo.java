
public class Veiculo {

	/**
	 * Metodos para Ligar e Desligar
	 */
	
	protected boolean ligado;

	public void ligar() {
		ligado = true;
	}
	public void desligar() {
		ligado = false;
	}
	
	
	public boolean isLigado() {
		return ligado;
	}
	

}
