class Banco {
    private String nome;
    private String cnpj;
    private Funcionario[] funcionarios;
    private int totalFuncionarios;
    
    Banco(String nome, String cnpj, int quantidadeFuncionarios) {
	this.nome = nome;
	this.cnpj = cnpj;
	this.funcionarios = new Funcionario[quantidadeFuncionarios];
    }

    public void cadastrarFuncionario(Funcionario f) {
	this.funcionarios[totalFuncionarios] = f;
	this.totalFuncionarios++;
    }
    
    public Funcionario getFuncionario(int posicao) {
	return this.funcionarios[posicao];
    }

    public String getNome() {
	return this.nome;
    }

    public String getCnpj() {
	return this.cnpj;
    }
}
