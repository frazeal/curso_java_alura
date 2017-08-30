package alura.desenvolvedorJava.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import alura.desenvolvedorJava.excecoes.ValorInvalidoException;

public class TestaCollectionsExercicios {

	public static void main(String[] args) throws ValorInvalidoException {
		
		List<Cliente> clientes = new LinkedList<Cliente>();
		Cliente cl1 = new Cliente("Marina", "São Paulo");
		Cliente cl2 = new Cliente("Carolina", "Saúde");
		Cliente cl3 = new Cliente("Jaqueline", "Morro verde");
		clientes.add(cl1);
		clientes.add(cl2);
		clientes.add(cl3);
		Random random = new Random();
		
		List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
		ContaPoupanca c1 = new ContaPoupanca(1000, clientes.get(2));
		c1.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c1);

		ContaPoupanca c2 = new ContaPoupanca(800, clientes.get(0));
		c2.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c2);

		ContaPoupanca c3 = new ContaPoupanca(600, clientes.get(1));
		c3.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c3);

		Collections.sort(contas);
		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}
		
		System.out.println(contas);
		
	}
}
