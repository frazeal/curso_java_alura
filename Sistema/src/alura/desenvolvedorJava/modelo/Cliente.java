package alura.desenvolvedorJava.modelo;

import alura.desenvolvedorJava.interfaces.Autenticavel;

public class Cliente implements Autenticavel {

	private String nome;
	private String endereco;

	@Override
	public boolean autenticar(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

}
