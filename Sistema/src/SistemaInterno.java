package aulaInterface;

public class SistemaInterno {
	
	public void autenticar(Autenticavel f) {
		
		int senha = 123;
		
		if (f.autenticar(senha) == true) {
			System.out.println("Bem vindo ao sistema");
		} else {
			System.out.println("Senha incorreta");
		}
	}
}
