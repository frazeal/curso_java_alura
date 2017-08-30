package alura.desenvolvedorJava.programa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import alura.desenvolvedorJava.modelo.Conta;
import alura.desenvolvedorJava.modelo.ContaCorrente;
import alura.desenvolvedorJava.modelo.ContaPoupanca;

public class TestaColecoes {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Gabriela");
		nomes.add("Francisco");
		nomes.add("Francisco");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Gabriela"));
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("Ordenado!");
		Collections.sort(nomes);
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		List<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new ContaPoupanca(800);
		Conta c2 = new ContaPoupanca(700);
		contas.add(c1);
		contas.add(c2);
		
		Collections.sort(contas);
		
		for(Conta conta : contas) {
			System.out.println(conta);
		}
		
		//System.out.println(contas.get(1));
		Set<String> livros = new HashSet<String>();
		livros.add("Senhor dos aneis");
		livros.add("Frankenstein");
		livros.add("Frankenstein");
		System.out.println(livros.size());
		
		Collection<Conta> contas2 = new HashSet<Conta>();
		
		Conta c3 = new ContaCorrente(800);
		Conta c4 = new ContaCorrente(700);
		contas2.add(c3);
		contas2.add(c4);
		
		for(Conta conta : contas2) {
			System.out.println(conta);
		}
		
		Map<String, Conta> contas3 = new HashMap();
		contas3.put("gerente", c3);
		contas3.put("diretor", c4);

		System.out.println(contas3.get("diretor").getSaldo());
	}

}
