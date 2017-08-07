import java.lang.StringBuilder;

class Data {
    private int dia;
    private int mes;
    private int ano;
    private char separador;

    public Data(int d, int m, int a, char s) {
	this.dia = d;
	this.mes = m;
	this.ano = a;
	this.separador = s;
    }

    public void setData(int dia, int mes, int ano) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
    }

    public String getDataFormatada() {
	StringBuilder sb = new StringBuilder();
	sb.append(this.dia);
	sb.append(this.separador);
	sb.append(this.mes);
	sb.append(this.separador);
	sb.append(this.ano);
	return sb.toString();
    }
}
