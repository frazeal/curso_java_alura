package alura.desenvolvedorJava.modelo;

public class Desenvolvedor extends Funcionario {

	@Override
	public double getBonificacao() {
		return this.salario * 0.25;
	}
	
}
