package alura.desenvolvedorJava.programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numeros = new ArrayList<Integer>();
		
		for(int i = 1; i <= 1000; i++) {
			numeros.add(i);
		}
		
		Collections.reverse(numeros);
		for (Integer n : numeros) {
			System.out.println(n);
		}
	}

}
