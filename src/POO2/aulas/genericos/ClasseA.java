package POO2.aulas.genericos;

public class ClasseA {

    public void imprimirVetor(Integer vetor[]) {
        for (Integer v : vetor) {
            System.out.println(v);
        }
        System.out.println("\n");
    }

    public void imprimirVetor(Double vetor[]) {
        for (Double v : vetor) {
            System.out.println(v);
        }
        System.out.println("\n");
    }

    public void imprimirVetor(String vetor[]) {
        for (String v : vetor) {
            System.out.println(v);
        }
        System.out.println("\n");
    }
}
