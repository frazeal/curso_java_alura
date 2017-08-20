package prjInterfaces;

public class Teste {

	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(2, 3);
		System.out.println("A área do " + a.toString() + " é: " + a.calcularArea());
		
		AreaCalculavel c = new Circulo(1);
		System.out.println("A área do " + c.toString() + " é: " + c.calcularArea());
	}

}
