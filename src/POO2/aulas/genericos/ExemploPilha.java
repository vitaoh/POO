package POO2.aulas.genericos;

import POO2.aulas.colecoes.Pessoa;

public class ExemploPilha {

    public static void main(String[] args) {

        Pilha<Integer> pilhaInteiros = new Pilha<>();

        pilhaInteiros.adicionar(22);
        pilhaInteiros.adicionar(51);
        pilhaInteiros.adicionar(1023);

        System.out.println(pilhaInteiros);
        System.out.println(pilhaInteiros.remover());
        System.out.println(pilhaInteiros);

        System.out.println("---");

        Pessoa p1 = new Pessoa("João", 23);
        Pessoa p2 = new Pessoa("Maria", 32);
        Pessoa p3 = new Pessoa("Carlos", 18);

        Pilha pilhaO = new Pilha();

        pilhaO.adicionar(p1);
        pilhaO.adicionar(p2);
        pilhaO.adicionar(p3);

        System.out.println(pilhaO);
        System.out.println(pilhaO.remover());
        System.out.println(pilhaO);

        System.out.println("");

        Pessoa aux = (Pessoa) pilhaO.remover();
        System.out.println(aux);
        System.out.println("---");

        Pilha<Pessoa> pilhaP = new Pilha();

        pilhaP.adicionar(p1);
        pilhaP.adicionar(p2);
        pilhaP.adicionar(p3);

        System.out.println(pilhaP);
        System.out.println(pilhaP.remover().getIdade());
        System.out.println(pilhaP);
    }
}
