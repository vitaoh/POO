package POO1.exercicios.lista2013.ex224;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void duplicaData() {
        dia = dia * 2;
        mes = mes * 2;
        ano = ano * 2;
    }

    public void imprimirData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
