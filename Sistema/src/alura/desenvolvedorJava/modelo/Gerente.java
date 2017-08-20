package alura.desenvolvedorJava.modelo;

import alura.desenvolvedorJava.interfaces.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	protected int senha;
	protected int numeroFuncionariosGerenciados;
	
	@Override
	public double getBonificacao() {
		return this.salario * 0.3;
	}

	@Override
	public boolean autenticar(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
