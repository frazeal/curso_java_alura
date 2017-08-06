
class Banco {
    public static void main(String[] args) {
	Funcionario f1 = new Funcionario();

	f1.nome = "Hugo";
	f1.salario = 100.0;
	f1.receberAumento(50);
	f1.dataEntrada = new Data();
	f1.dataEntrada.preencherData(1, 7, 2009);

	f1.mostrar();

        Funcionario f2 = new Funcionario();        
        f2.nome = "Hugo";
        f2.salario = 1000.0;

	Funcionario f3 = f1;

        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");        
        }

	if (f3 == f1) {
	    System.out.println("iguais");
	} else {
	    System.out.println("diferentes");
	}
    }
}
