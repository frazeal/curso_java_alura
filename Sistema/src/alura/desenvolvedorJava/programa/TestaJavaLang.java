package alura.desenvolvedorJava.programa;

import alura.desenvolvedorJava.modelo.Conta;
import alura.desenvolvedorJava.modelo.ContaCorrente;

public class TestaJavaLang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub(
		Conta c1 = new ContaCorrente(500.0);
		Conta c2 = new ContaCorrente(700.0);
		
		GuardadorDeObjetos armario = new GuardadorDeObjetos();
		armario.adicionarObjeto(c1);
		armario.adicionarObjeto(c2);
		
		Conta c1NoArmario = (Conta) armario.pega(0);
		
		System.out.println(c1NoArmario.getSaldo());
	}

}
