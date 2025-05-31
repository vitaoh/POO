package POO1.aulas.classe.metodos.sobrecarga;

import POO1.aulas.classe.modificadores.estatico.CalculadorDePontos;

public class Main {

    public static void main(String[] args) {

        Ponto origem = new Ponto();

        Ponto p = new Ponto(5.0, 5.0);

        Ponto k = new Ponto("x", 3.0);

        Ponto o = new Ponto("y", -2.0);

        // sobrecarga do setX
        p.setX();
        
        System.out.println(CalculadorDePontos.calcularDistanciaPontos(origem, k));
        
    }
}
