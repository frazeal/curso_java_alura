
public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public abstract double getBonus();
	
	public void mostra() {
		System.out.println(this.getBonus());
	}
}
