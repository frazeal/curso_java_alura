package alura.desenvolvedorJava.modelo;

import alura.desenvolvedorJava.excecoes.ValorInvalidoException;

public abstract class Conta {
	protected double saldo;
	protected int numero;

	public Conta(double saldo) {
		// TODO Auto-generated constructor stub
		this.saldo = saldo;
	}
	
	public Conta(double saldo, int numero) {
		// TODO Auto-generated constructor stub
		this.saldo = saldo;
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void deposita(double valor) throws ValorInvalidoException;

	public abstract void saca(double valor);

	public abstract void atualiza(double taxa);
	
	@Override
	public String toString() {
		return "Conta com saldo " + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Conta)) {
			return false;
		}
		Conta outra = (Conta) obj;
		return this.numero == outra.numero;
	}

}