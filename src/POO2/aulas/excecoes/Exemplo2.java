package POO2.aulas.excecoes;

public class Exemplo2 {

    public static void main(String[] args) {

        String[] vetor = new String[5];

        vetor[0] = "IFSP";

        try {

            System.out.println(vetor[0]);
            System.out.println(vetor[0].toLowerCase());

       //     System.out.println(vetor[1].charAt(0));
            System.out.println(vetor[5]);

        } catch (NullPointerException ex1) {
            System.out.println("Ocorreu uma exceção NullPointerException");
        } catch (ArrayIndexOutOfBoundsException ex2) {
            System.out.println(ex2.getMessage());
            ex2.printStackTrace();
        }
        System.out.println(vetor[0]);
    }
}
