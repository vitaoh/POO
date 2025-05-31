package POO1.exercicios.lista2013.ex230;

public class Data {
    
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificarData() {

        if (dia > 31) {
            return false;
        }
        else if (mes > 12) {
            return false;
        }
        else if (ano % 4 != 0 && mes == 2 && dia > 28) {
            return false;
        }
        else if (ano % 4 == 0 && mes == 2 && dia > 29) {
            return false;
        }
        else if (mes < 8 && mes % 2 == 0 && dia > 30 && mes != 2) {
            return false;
        }
        else if (mes >= 8 && mes % 2 == 1 && dia > 30) {
            return false;
        }
        return true;
    }
    
}
