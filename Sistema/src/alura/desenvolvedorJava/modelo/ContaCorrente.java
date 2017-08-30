package alura.desenvolvedorJava.modelo;

import alura.desenvolvedorJava.modelo.Conta;

public class ContaCorrente extends Conta implements Comparable<Conta>{

	public ContaCorrente(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(double saldo, int numero) {
		// TODO Auto-generated constructor stub
		super(saldo, numero);
	}

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

	@Override
	public int compareTo(Conta outra) {
		// TODO Auto-generated method stub
		return this.getNumero() - outra.getNumero();
	}

}