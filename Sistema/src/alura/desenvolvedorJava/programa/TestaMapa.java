package alura.desenvolvedorJava.programa;

import java.util.HashMap;
import java.util.Map;

import alura.desenvolvedorJava.modelo.Conta;
import alura.desenvolvedorJava.modelo.ContaCorrente;

public class TestaMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new ContaCorrente(1000);
		Conta c2 = new ContaCorrente(2000);
		
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}

}