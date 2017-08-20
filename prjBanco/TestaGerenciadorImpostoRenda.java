
public class TestaGerenciadorImpostoRenda {
	public static void main(String[] args) {
		GerenciadorImpostosRenda gerenciador = new GerenciadorImpostosRenda();

		SeguroVida sv = new SeguroVida();
		gerenciador.adicionar(sv);

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		gerenciador.adicionar(cc);

		System.out.printf("O saldo é: %.2f\n", gerenciador.getTotal());
	}
}
