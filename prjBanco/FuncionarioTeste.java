class FuncionarioTeste {
    public static void main(String[] args) {
	Funcionario f = new Funcionario();

	f.setNome("Francisco");
	f.setSalario(1000.0);
	f.setDataEntrada(new Data(6,3,1990,'-'));

	f.mostrar();
    }
}
