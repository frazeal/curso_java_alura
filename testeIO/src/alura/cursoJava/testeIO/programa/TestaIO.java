package alura.cursoJava.testeIO.programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();
		
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write(linha);
		
		bw.close();
		bw.close();
	}

}
