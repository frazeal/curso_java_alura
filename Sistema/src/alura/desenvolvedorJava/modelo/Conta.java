package alura.desenvolvedorJava.modelo;

import alura.desenvolvedorJava.excecoes.ValorInvalidoException;

public abstract class Conta {
	protected double saldo;

	public Conta(double saldo) {
		// TODO Auto-generated constructor stub
		this.saldo = saldo;
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

}