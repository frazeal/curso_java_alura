package alura.desenvolvedorJava.excecoes;

public class ValorInvalidoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}
}
