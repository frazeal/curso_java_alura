class Gerente extends Funcionario {
    int senha;
    int numeroDeFuncionariosGerenciados;

    public boolean autenticar(int senha) {
	if (this.senha == senha) {
	    System.out.println("Acesso permitido!");
	    return true;
	} else {
	    System.out.println("Acesso negado!");
	    return false;
	}

    }

    void setSenha(int senha) {
	this.senha = senha;
    }

    public double getBonificacao() {
	return this.salario * 0.15;
    }

}
