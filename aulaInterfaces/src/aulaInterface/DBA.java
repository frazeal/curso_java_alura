package aulaInterface;

public class DBA extends Funcionario {

	@Override
	public double getBonificacao() {
		return this.salario * 0.10;
	}

}
