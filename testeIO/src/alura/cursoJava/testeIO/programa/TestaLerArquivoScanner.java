package alura.cursoJava.testeIO.programa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaLerArquivoScanner {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream is = new FileInputStream("arquivo.txt");
		Scanner sc = new Scanner(is);
		PrintStream ps = new PrintStream("saida.txt");
		while (sc.hasNextLine()) {
			ps.println(sc.nextLine());
		}
		ps.close();
		sc.close();
	}

}
