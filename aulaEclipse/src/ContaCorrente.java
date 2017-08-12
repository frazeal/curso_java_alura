
public class ContaCorrente extends Conta {
	@Override
	public void atualiza(double taxa) {
		super.atualiza(2 * taxa);
	}
}