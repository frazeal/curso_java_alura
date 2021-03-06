package alura.desenvolvedorJava.programa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaDesempenho {

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        Collection<Integer> teste = new ArrayList<Integer>();
        long inicio = System.currentTimeMillis();

        int total = 300000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
       
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);

        
        System.out.println("Iniciando...");
        Collection<Integer> testeHash = new HashSet<Integer>();
        inicio = System.currentTimeMillis();

        for (int i = 0; i < total; i++) {
            testeHash.add(i);
        }

        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);

        for (int i = 0; i < total; i++) {
            testeHash.contains(i);
        }

        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    }
}