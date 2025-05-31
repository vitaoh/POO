package POO1.exercicios.lista2013.ex234;

public class NumeroComplexo {
    
    private double real;
    private double imaginario;

    public void inicializaNúmero(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public void imprimeNúmero() {
        System.out.println(real + " + " + imaginario + "i");
    }

    public boolean éIgual(NumeroComplexo outro) {
        return this.real == outro.real && this.imaginario == outro.imaginario;
    }

    public NumeroComplexo soma(NumeroComplexo outro) {
        NumeroComplexo resultado = new NumeroComplexo();
        resultado.real = this.real + outro.real;
        resultado.imaginario = this.imaginario + outro.imaginario;
        return resultado;
    }

    public NumeroComplexo subtrai(NumeroComplexo outro) {
        NumeroComplexo resultado = new NumeroComplexo();
        resultado.real = this.real - outro.real;
        resultado.imaginario = this.imaginario - outro.imaginario;
        return resultado;
    }

    public NumeroComplexo multiplica(NumeroComplexo outro) {
        NumeroComplexo resultado = new NumeroComplexo();
        resultado.real = (this.real * outro.real) - (this.imaginario * outro.imaginario);
        resultado.imaginario = (this.real * outro.imaginario) + (this.imaginario * outro.real);
        return resultado;
    }

    public NumeroComplexo divide(NumeroComplexo outro) {
        NumeroComplexo resultado = new NumeroComplexo();
        double divisor = (outro.real * outro.real) + (outro.imaginario * outro.imaginario);
        resultado.real = ((this.real * outro.real) + (this.imaginario * outro.imaginario)) / divisor;
        resultado.imaginario = ((this.imaginario * outro.real) - (this.real * outro.imaginario)) / divisor;
        return resultado;
    }
}
