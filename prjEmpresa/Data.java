class Data {
    int dia;
    int mes;
    int ano;

    void preencherData(int dia, int mes, int ano) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
    }

    String retornarDataFormatada() {
	return (this.dia +
		"/" + this.mes +
		"/"  + this.ano);
    }
}
