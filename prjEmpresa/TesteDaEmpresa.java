class TesteDaEmpresa {
    public static void main(String[] args) {
	Empresa empresa = new Empresa();

	empresa.funcionarios = new Funcionario[5];
	for (int i = 0; i < empresa.funcionarios.length; i++) {
	    Funcionario f = new Funcionario();
	    f.nome = "Funcionario " + (i + 1);
	    f.salario = 1000 + (i * 100);
	    f.dataEntrada = new Data();
	    empresa.adicionarFuncionario(f);
	}

	empresa.listarFuncionarios();

    }
}
