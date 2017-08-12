class ContaPoupanca extends Conta {
    public void atualiza(double taxa) {
	this.saldo *= (1 + 3 * taxa);
    }

    public void deposita(double valor) {
	this.saldo += valor - 0.10;
    }
}
