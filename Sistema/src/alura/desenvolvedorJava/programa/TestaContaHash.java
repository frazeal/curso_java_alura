package alura.desenvolvedorJava.programa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import alura.desenvolvedorJava.excecoes.ValorInvalidoException;
import alura.desenvolvedorJava.modelo.Cliente;
import alura.desenvolvedorJava.modelo.Conta;
import alura.desenvolvedorJava.modelo.ContaPoupanca;

public class TestaContaHash {

	public static void main(String[] args) throws ValorInvalidoException {
		// TODO Auto-generated method stub
		List<Cliente> clientes = new LinkedList<Cliente>();
		Cliente cl1 = new Cliente("Marina", "São Paulo");
		Cliente cl2 = new Cliente("Carolina", "Saúde");
		Cliente cl3 = new Cliente("Jaqueline", "Morro verde");
		clientes.add(cl1);
		clientes.add(cl2);
		clientes.add(cl3);
		
		Collection<ContaPoupanca> contas = new HashSet<ContaPoupanca>();
		ContaPoupanca c1 = new ContaPoupanca(1000, clientes.get(2));
		c1.deposita(1200);
		contas.add(c1);

		ContaPoupanca c2 = new ContaPoupanca(800, clientes.get(0));
		c2.deposita(3000);
		contas.add(c2);

		ContaPoupanca c3 = new ContaPoupanca(600, clientes.get(1));
		c3.deposita(2100);
		contas.add(c3);

		
		System.out.println("Total de contas: " + contas.size());
		
	}

}
