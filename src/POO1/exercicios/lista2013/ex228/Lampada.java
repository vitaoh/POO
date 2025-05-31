package POO1.exercicios.lista2013.ex228;

public class Lampada {
    
    private boolean estado;
    private Contador contadorAcesa;

    public Lampada() {
        this.estado = false;
        this.contadorAcesa = new Contador();
    }

    public void acender() {
        if(!estado) {
            estado = true;
            contadorAcesa.incrementar();
        }
    }

    public void apagar() {
        if(estado) {
            estado = false;
        }
    }

    public int getNumeroDeVezes() {
        return contadorAcesa.getValor();
    }

}
