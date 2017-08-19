
public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo *= (1 + 3 * taxa);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}
}
