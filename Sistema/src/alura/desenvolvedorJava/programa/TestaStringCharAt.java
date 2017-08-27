package alura.desenvolvedorJava.programa;

public class TestaStringCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teste = "Vamos testar o funcionamento do método criado.";
		// imprimeLetraPorLetra(teste);
		// imprimeLetraPorLetraReverso("Socorram-me subi no ônibus em marrocos");
		// imprimeLetraPorLetraReverso("Anotaram a data da maratona");
		// imprimePalavraPorPalavraReversoOtimiziadoSinglethread(teste);
		imprimeTextoReversoOrimizado(teste);
	}

	public static void imprimeLetraPorLetra(String st) {
		for (int i = 0; i < st.length(); i++) {
			System.out.println(st.charAt(i));
		}
	}

	public static void imprimeLetraPorLetraReverso(String st) {
		for (int i = st.length() - 1; i >= 0; i--) {
			System.out.println(st.charAt(i));
		}
	}
	
	public static void imprimeTextoReversoOrimizado(String st) {
		StringBuilder sb = new StringBuilder(st);
		System.out.println(sb.reverse());
	}

	public static void imprimePalavraPorPalavraReverso(String st) {
		String[] palavras;
		palavras = st.split(" ");
		for (int i = palavras.length - 1; i >= 0; i--) {
			System.out.println(palavras[i]);
		}
	}
	
	public static void imprimePalavraPorPalavraReversoOtimiziadoMultithread(String st) {
		StringBuffer sb = new StringBuffer(st);
		String[] palavras = sb.toString().split(" ");
		for (int i = palavras.length - 1; i >= 0; i--) {
			System.out.println(palavras[i]);
		}
	}
	
	public static void imprimePalavraPorPalavraReversoOtimiziadoSinglethread(String st) {
		StringBuilder sb = new StringBuilder(st);
		String[] palavras = sb.toString().split(" ");
		for (int i = palavras.length - 1; i >= 0; i--) {
			System.out.println(palavras[i]);
		}
	}

}
