package prjInterfaces;

public class Circulo implements AreaCalculavel {
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * this.raio * this.raio;
	}
	
	@Override
	public String toString() {
		return "Círculo";
	}
}
