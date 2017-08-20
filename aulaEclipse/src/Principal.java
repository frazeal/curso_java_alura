
public class Principal {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		try {
			conta.deposita(-100.0);
			System.out.println(conta.getSaldo());
		} catch (IllegalArgumentException ie) {
			System.out.println("Você tentou depositar um valor inválido");
		}
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.atualiza(0.02);
	}

}
