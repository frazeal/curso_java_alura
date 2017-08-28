package alura.desenvolvedorJava.programa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;

public class TestaJavaUtil {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			copiarArquivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void copiarArquivo() throws IOException {
		Scanner sc = new Scanner("entrada.txt");
		PrintStream ps = new PrintStream("saida.txt");

		while (sc.hasNextLine()) {
			ps.println(sc.nextLine());
		}
	}

}