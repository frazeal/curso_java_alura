package alura.desenvolvedorJava.programa;

import alura.desenvolvedorJava.modelo.Conta;

public class GuardadorDeObjetos {
	private Object[] contas;
	private int posicaoLivre;
	
	public void adicionarObjeto(Object novo) {
		this.contas[this.posicaoLivre] = novo;
		this.posicaoLivre++;
	}
	
	public Object pega(int posicao) {
		return this.contas[posicao];
	}
	
	public GuardadorDeObjetos() {
		this.contas = new Object[100];
		this.posicaoLivre = 0;
	}
}
