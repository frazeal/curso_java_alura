package alura.desenvolvedorJava.programa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceAdicionarPrimeiraPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando LinkedList...");
        long inicio = System.currentTimeMillis();

        // trocar depois por ArrayList                
        List<Integer> testeLinked = new LinkedList<>();

        for (int i = 0; i < 3000000; i++) {
            testeLinked.add(0, i);
        }

        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);

		System.out.println("Iniciando ArrayList...");
        inicio = System.currentTimeMillis();

        // trocar depois por ArrayList                
        List<Integer> testeArray = new ArrayList<>();

        for (int i = 0; i < 3000000; i++) {
            testeArray.add(0, i);
        }

        fim = System.currentTimeMillis();
        tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);
	}

}
