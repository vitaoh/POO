package POO2.exercicios.exercicio3;

import java.util.*;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public int compareTo(Person other) {
        int ageComparison = Integer.compare(this.age, other.age);
        if (ageComparison != 0) {
            return ageComparison;
        }
        return this.name.compareTo(other.name);
    }
    
    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
    
    public static void main(String[] args) {
        List<Person> pessoas1 = Arrays.asList(
            new Person("Ana", 25),
            new Person("Carlos", 30),
            new Person("Elena", 22)
        );
        
        List<Person> pessoas2 = Arrays.asList(
            new Person("Bruno", 28),
            new Person("Diana", 35),
            new Person("Felipe", 20)
        );
        
        List<Person> pessoasMescladas = ListMerger.mergeAlternating(pessoas1, pessoas2);
        System.out.println("Pessoas mescladas:");
        System.out.println("Lista 1: " + pessoas1);
        System.out.println("Lista 2: " + pessoas2);
        System.out.println("Resultado: " + pessoasMescladas);
        System.out.println();
        
        List<Person> todasPessoas = Arrays.asList(
            new Person("Ana", 25),
            new Person("Bruno", 28),
            new Person("Carlos", 30),
            new Person("Diana", 35),
            new Person("Elena", 22),
            new Person("Felipe", 20)
        );
        
        Person alvo = new Person("Carlos", 30);
        ArrayList<Person> pessoasFiltradas = ListFilter.filterGreaterOrEqual(todasPessoas, alvo);
        
        System.out.println("Pessoas filtradas:");
        System.out.println("Lista original: " + todasPessoas);
        System.out.println("Alvo: " + alvo);
        System.out.println("Pessoas >= " + alvo + ": " + pessoasFiltradas);
    }
}
