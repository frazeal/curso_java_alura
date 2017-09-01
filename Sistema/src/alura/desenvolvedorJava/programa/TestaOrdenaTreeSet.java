package alura.desenvolvedorJava.programa;

import java.util.Set;
import java.util.TreeSet;

public class TestaOrdenaTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		
		for(int i = 1; i <= 1000; i++) {
			numeros.add(i);
		}
		
		for (Integer n : numeros.descendingSet()) {
			System.out.println(n);
		}
	}
}
