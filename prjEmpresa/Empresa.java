class Empresa {
    String nome;
    String cnpj;
    Funcionario[] funcionarios;
    int totalFuncionarios = 0;

    void adicionarFuncionario(Funcionario f) {
	this.funcionarios[totalFuncionarios] = f;
	this.totalFuncionarios++;
    }

    void listarFuncionarios() {
	for(Funcionario f : this.funcionarios) {
	    f.mostrar();
	}
    }

    boolean contem(Funcionario f) {
	boolean contem = false;
	for (Funcionario x : this.funcionarios) {
	    if (x == f) {
		contem = true;
		break;
	    }
	}
	return contem;
    }
}
