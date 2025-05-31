package POO2.aulas.genericos;

public class ExemploA {
    public static void main(String[] args) {
        
        Integer vetorInteiros[] = {5, 5, 1023};
        Double vetorDoubles[] = {0.5, 1.25, 6.7};
        String vetorStrings[] = {"abacaxi", "mamão", "uva"};
        
        ClasseA objA = new ClasseA();
        
        objA.imprimirVetor(vetorInteiros);
        objA.imprimirVetor(vetorDoubles);
        objA.imprimirVetor(vetorStrings);
    }
}
