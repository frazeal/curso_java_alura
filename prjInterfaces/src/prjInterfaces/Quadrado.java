package prjInterfaces;

public class Quadrado implements AreaCalculavel {
	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}
	
	@Override
	public String toString() {
		return "Quadrado";
	}
}
