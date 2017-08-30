package alura.desenvolvedorJava.modelo;

import java.util.HashMap;
import java.util.Map;

public class Banco {

	private Map<String, Conta> contas = new HashMap<String, Conta>();
	
	public void adicionarConta(Conta c) {
		this.contas.put(c.getTitular().getNome(), c);
	}
	
	public Conta buscarPorNome(String nome) {
		return this.contas.get(nome);
	}
	
	public int retornarQuantidadeDeContas() {
		return this.contas.size();
	}
}
