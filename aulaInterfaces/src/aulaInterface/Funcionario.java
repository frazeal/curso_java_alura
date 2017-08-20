package aulaInterface;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public abstract double getBonificacao();

}
