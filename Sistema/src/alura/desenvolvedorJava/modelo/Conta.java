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
	public boolean equals(Object obj) {
		if (!(obj instanceof Conta)) {
			return false;
		}
		Conta outra = (Conta) obj;
		return ((this.numero == outra.numero) && (this.getTitular().getNome().equals(outra.getTitular().getNome())));
	}

	@Override
	public int compareTo(Conta outra) {
		if (this.saldo < outra.saldo) { return -1; }
		if (this.saldo > outra.saldo) { return 1; }
		return 0;
	}
	
	

}