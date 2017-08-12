class Conta {
    private double saldo;

    public double getSaldo() {
	return this.saldo;
    }
    
    public void setSaldo(double saldo) {
	this.saldo = saldo;
    }

    public void deposita(double valor) {
	this.saldo += saldo;
    }

    public void saca(double valor) {
	this.saldo -= valor;
    }
}
