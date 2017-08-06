class Funcionario {
      String nome;
      String departamento;
      double salario;
      Data dataEntrada;
      String rg;

      void receberAumento(double valor) {
      	   this.salario += valor;
      }

      double calcularGanhoAnual() {
	  return (this.salario * 12.0);
      }

    void mostrar() {
	System.out.println("Nome: " + this.nome);
	System.out.println("Departamento: " + this.departamento);
	System.out.println("Salário: " + this.salario);
	System.out.println("Data de entrada: " + this.dataEntrada.retornarDataFormatada());
	System.out.println("RG: " + rg);
    }
}
