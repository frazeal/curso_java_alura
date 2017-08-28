package alura.desenvolvedorJava.programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaJavaIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			copiarArquivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void copiarArquivo() throws IOException{
		InputStream is = new FileInputStream("entrada.txt");
		InputStreamReader isr  = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		while (linha != null) {
			bw.append(linha);
			bw.newLine();
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	}
	
}
