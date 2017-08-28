package alura.cursoJava.testeIO.programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaLerAquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();
		
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write(linha);
		
		while (linha != null) {
			bw.append(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		bw.close();
		bw.close();
	}

}
