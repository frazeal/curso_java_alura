package aulaInterface;

public class Diretor extends Funcionario implements Autenticavel {

	@Override
	public double getBonificacao() {
		return this.salario * 0.35;
	}

	@Override
	public boolean autenticar(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
