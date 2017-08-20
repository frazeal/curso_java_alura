package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo *= (1 + 3 * taxa);
	}

	@Override
	public void deposita(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor - 0.10;
		}
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}
}
