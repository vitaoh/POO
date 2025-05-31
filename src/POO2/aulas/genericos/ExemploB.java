package POO2.aulas.genericos;

import POO2.aulas.colecoes.Pessoa;

public class ExemploB {
    public static void main(String[] args) {
        
        Integer vetorInteiros[] = {5, 5, 1023};
        Double vetorDoubles[] = {0.5, 1.25, 6.7};
        String vetorStrings[] = {"abacaxi", "mamão", "uva"};
        
        Pessoa vetorPessoas[] = {new Pessoa("Joao", 23), new Pessoa("Maria", 32), new Pessoa("Carlos", 18)};
        
        ClasseB objB = new ClasseB();
        
        objB.imprimirVetor(vetorInteiros);
        objB.imprimirVetor(vetorDoubles);
        objB.imprimirVetor(vetorStrings);
        
        objB.imprimirVetor(vetorPessoas);
        
        System.out.println("---");
        
        Pessoa maisVelho = objB.maximo(vetorPessoas[0], vetorPessoas[1], vetorPessoas[2]);
        System.out.println(maisVelho);
        
        int valorInteiroMax = objB.maximo(vetorInteiros[0], vetorInteiros[1], vetorInteiros[2]);
        System.out.println(valorInteiroMax);
        
        double valorDoubleMax = objB.maximo(vetorDoubles[0], vetorDoubles[1], vetorDoubles[2]);
        System.out.println(valorDoubleMax);
        
        String valorStringMax = objB.maximo(vetorStrings[0], vetorStrings[1], vetorStrings[2]);
        System.out.println(valorStringMax);
    }
}
