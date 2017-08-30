package alura.desenvolvedorJava.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Conta> contas = new ArrayList<Conta>();
	
	public void adicionarConta(Conta c) {
		this.contas.add(c);
	}
	
	public Conta retornarConta(int x) {
		return this.contas.get(x);
	}
	
	public int retornarQuantidadeDeContas() {
		return this.contas.size();
	}
}
