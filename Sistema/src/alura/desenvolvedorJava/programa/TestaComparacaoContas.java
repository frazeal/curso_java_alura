package alura.desenvolvedorJava.programa;

import alura.desenvolvedorJava.modelo.Cliente;
import alura.desenvolvedorJava.modelo.Conta;
import alura.desenvolvedorJava.modelo.ContaCorrente;

public class TestaComparacaoContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new ContaCorrente(1000, 1);
		Conta c2 = new ContaCorrente(2000, 1);
		Cliente cli = new Cliente("joao", "são paulo");
		c1.setTitular(cli);
		c2.setTitular(cli);
		
		
		if (c1 == c2) {
			System.out.println("As contas são iguais");
		} else {
			System.out.println("As contas são diferentes");
		}
		
		if (c1.equals(c2)) {
			System.out.println("As contas são iguais");
		} else {
			System.out.println("As contas são diferentes");
		}
	}

}
