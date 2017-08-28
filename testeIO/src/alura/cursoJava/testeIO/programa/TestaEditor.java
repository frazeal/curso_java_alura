package alura.cursoJava.testeIO.programa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaEditor {
	public static void main(String[] args) throws FileNotFoundException {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		OutputStream os = new FileOutputStream("saida.txt");//System.out;
		PrintStream ps = new PrintStream(os);
		while (sc.hasNextLine()) {
			ps.println(sc.nextLine());
		}
		ps.close();
		sc.close();
	}
}
