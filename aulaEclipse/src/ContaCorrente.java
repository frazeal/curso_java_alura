
public class ContaCorrente extends Conta {
	@Override
	public void atualiza(double taxa) {
		this.saldo *= 1 + 2*taxa;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}
}