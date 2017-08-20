class TestaContas {
	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		cc.deposita(1000);
		cp.deposita(1000);

		cc.atualiza(0.02);
		cp.atualiza(0.03);

		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}
