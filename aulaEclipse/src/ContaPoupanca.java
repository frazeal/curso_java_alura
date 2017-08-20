
public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo *= (1 + 3 * taxa);
	}

	@Override
	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException();
		} else {
			this.saldo += valor - 0.10;
		}
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}
}
