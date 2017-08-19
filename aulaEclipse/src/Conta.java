public abstract class Conta {
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void deposita(double valor);
	
	public abstract void saca(double valor);
	
	public abstract void atualiza(double taxa);

}