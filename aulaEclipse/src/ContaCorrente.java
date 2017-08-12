
public class ContaCorrente extends Conta {
	public void atualiza(double taxa) {
		this.saldo *= (1 + 2 * taxa);
	}
}