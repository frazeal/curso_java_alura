package alura.desenvolvedorJava.programa;

public class TestaStringCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teste = "Vamos testar o funcionamento do método criado.";
		imprimeLetraPorLetra(teste);
		imprimeLetraPorLetraReverso("Socorram-me subi no ônibus em marrocos");
		imprimeLetraPorLetraReverso("Anotaram a data da maratona");
	}
	
	public static void imprimeLetraPorLetra(String st) {
		for(int i = 0; i < st.length(); i++) {
			System.out.println(st.charAt(i));
		}
	}
	
	public static void imprimeLetraPorLetraReverso(String st) {
		for (int i = st.length() - 1; i >= 0; i--) {
			System.out.println(st.charAt(i));
		}
	}

}
