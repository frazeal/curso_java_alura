
public class Principal {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		try {
			conta.deposita(100.0);
			System.out.println(conta.getSaldo());
		} catch (IllegalArgumentException ie) {
			System.out.println("Você tentou depositar um valor inválido");
		}
		Conta cp = new ContaPoupanca();
		try {
			cp.deposita(-1000);
		} catch (ValorInvalidoException e) {
			System.out.println("Valor inválido passado como parâmetro.");
		}
	}

}
