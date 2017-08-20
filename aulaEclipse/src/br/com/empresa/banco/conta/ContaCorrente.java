package br.com.empresa.banco.conta;

public class ContaCorrente extends Conta {
	@Override
	public void atualiza(double taxa) {
		this.saldo *= 1 + 2 * taxa;
	}

	@Override
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException();
		} else {
			this.saldo += valor;
		}
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}
}