class Funcionario {
    protected String nome;
    protected String departamento;
    protected double salario;
    protected Data dataEntrada;
    protected String rg;
    protected static int identificador;

    public Funcionario() {
	this.identificador++;
    }

    public Funcionario(String nome) {
	this.nome = nome;
    }

    public int getIdentificador() {
	return this.identificador;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getDepartamento() {
	return this.departamento;
    }

    public void setDepartamento(String departamento) {
	this.departamento = departamento;
    }

    public double getSalario() {
	return this.salario;
    }

    public void setSalario(double salario) {
	this.salario = salario;
    }

    public Data getDataEntrada() {
	return this.dataEntrada;
    }

    public void setDataEntrada(Data dataEntrada) {
	this.dataEntrada = dataEntrada;
    }

    public String getRg() {
	return this.rg;
    }

    public void setRg(String rg) {
	this.rg = rg;
    }

    public void receberAumento(double valor) {
	this.setSalario(this.getSalario() + valor);
    }

    public double calcularGanhoAnual() {
	return (this.getSalario() * 12.0);
    }

    public void mostrar() {
	System.out.println("Idenrificador: " + this.getIdentificador());
	System.out.println("Nome: " + this.getNome());
	System.out.println("Departamento: " + this.getDepartamento());
	System.out.println("Salário: " + this.getSalario());
	System.out.println("Data de entrada: " + this.getDataEntrada().getDataFormatada());
	System.out.println("RG: " + this.getRg());
    }

    public double getBonificacao() {
	return this.salario * 0.10;
    }
}
