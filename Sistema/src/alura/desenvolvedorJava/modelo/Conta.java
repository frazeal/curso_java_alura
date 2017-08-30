package alura.desenvolvedorJava.modelo;

import alura.desenvolvedorJava.excecoes.ValorInvalidoException;

public abstract class Conta implements Comparable<Conta>{
	protected double saldo;
	protected int numero;
	protected Cliente titular;
	
	protected Conta() {
		
	}

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
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return this.numero;
	}

	public abstract void deposita(double valor) throws ValorInvalidoException;

	public abstract void saca(double valor);

	public abstract void atualiza(double taxa);
	
	@Override
	public String toString() {
		return "Conta com saldo " + this.saldo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	

}