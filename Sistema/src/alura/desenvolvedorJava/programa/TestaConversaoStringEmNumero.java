package alura.desenvolvedorJava.programa;

public class TestaConversaoStringEmNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "762";
		int i = converterStringParaInteger(x);
		System.out.printf("O número convertido é %d", i);
	}

	public static int converterStringParaInteger(String numero) {
		int numeroInt = 0;
		for (int n = 0; n < numero.length(); n++) {
			numeroInt += (Math.pow(10, (numero.length() - (n + 1)))) * converterCharParaInteger(numero.charAt(n));
		}
		return numeroInt;
	}

	public static int converterCharParaInteger(char c) {
		return c - '0';
	}
	
	@SuppressWarnings("unused")
	private static int converteParaInt(String numero) {
        int resultado = 0;
        while (numero.length() > 0) {
            char algarismo = numero.charAt(0);
            resultado = resultado * 10 + (algarismo - '0');
            numero = numero.substring(1);
        }
        return resultado;
    }

}
