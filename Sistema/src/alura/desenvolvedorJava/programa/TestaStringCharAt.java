package alura.desenvolvedorJava.programa;

public class TestaStringCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teste = "Vamos testar o funcionamento do método criado.";
		imprimeLetraPorLetra(teste);
	}
	
	public static void imprimeLetraPorLetra(String st) {
		for(int i = 0; i < st.length(); i++) {
			System.out.println(st.charAt(i));
		}
	}

}
