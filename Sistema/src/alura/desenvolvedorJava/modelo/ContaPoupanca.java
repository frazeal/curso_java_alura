package alura.desenvolvedorJava.modelo;

import alura.desenvolvedorJava.excecoes.ValorInvalidoException;

public class ContaPoupanca extends Conta implements Comparable<Conta> {

	public ContaPoupanca(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(int numero, Cliente titular) {
		this.numero = numero;
		this.titular = titular;
	}

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

	@Override
	public int compareTo(Conta outra) {
		return this.titular.getNome().compareTo(outra.titular.getNome());
	}
}
