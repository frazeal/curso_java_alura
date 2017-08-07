import java.lang.StringBuilder;

class Data {
    private int dia;
    private int mes;
    private int ano;
    private char separador;

    public Data(int d, int m, int a, char s) {
	if (EhDataValida(d, m, a)) {
	    this.dia = d;
	    this.mes = m;
	    this.ano = a;
	    this.separador = s;
	} else {
	    System.out.println("Essa data não é válida!!");
	}
    }

    public Data(int d, int m, int a) {
	this(d, m, a, '/');
    }

    public void setData(int dia, int mes, int ano, char separador) {
	this.setData(dia, mes, ano);
	this.setData(separador);
    }
    
    public void setData(int dia, int mes, int ano) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
    }

    public void setData(char s) {
	this.separador = s;
    }

    private boolean EhDataValida(int dia, int mes, int ano) {
	boolean status = false;
	if (EhDiaValido(dia, mes, ano) && EhMesValido(mes) && EhAnoValido(ano)) {
	    status = true;
	}
	return status;
    }

    private boolean EhDiaValido(int dia, int mes, int ano) {
	boolean status = false;
	int ultimoDia = 31;
	if (dia > 0) {
	    if (EhMesValido(mes)) {
		switch (mes) {
		case 2:
		    if (EhAnoBissexto(ano)) {
			ultimoDia = 29;
		    } else {
			ultimoDia = 28;
		    }
		    break;
		case 4:
		case 6:
		case 9:
		case 11:
		    ultimoDia = 30;
		} // end switch
            } else {
		status = false; // mes não é válido
	    }
        } // end if dia
	if (dia > ultimoDia) {
	    status = false;
	} else {
	    status = true;
	}
        return status;
    }

    private boolean EhAnoValido(int ano) {
	boolean status = false;
	if (ano >= 0) {
	    status = true;
	}
	return status;
    }

    private boolean EhAnoBissexto(int ano) {
	boolean status;
	if (((ano % 4) == 0) || ((ano % 400) == 0) || ((ano % 100) == 0)) {
	    status = true;
	} else {
	    status = false;
	}
	return status;
    }
    
    private boolean EhMesValido(int mes) {
	boolean status;
	if ((mes > 12) || (mes <= 0)) {
	    status = false;
	} else {
	    status = true;
	}
	return status;
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
