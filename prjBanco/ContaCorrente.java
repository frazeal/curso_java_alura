class ContaCorrente extends Conta implements Tributavel {
	public void atualiza(double taxa) {
		this.saldo *= (1 + 2 * taxa);
	}

	@Override
	public double calcularTributos() {
		return this.getSaldo() * 0.01;
	}
}
