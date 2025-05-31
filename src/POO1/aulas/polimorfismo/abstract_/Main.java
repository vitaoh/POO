package POO1.aulas.polimorfismo.abstract_;

public class Main {
    public static void main(String[] args) {
        
        // variável de superclasse pode receber refência de objeto subclasse
        Empregado emp1 = new Assalariado("Jõao", "851.654.234-24", 4200.4);
        
        System.out.println(emp1.proventoSemanal());
        // a variável de superclasse só tem acesso aos recursos (atributos e métodos) definidos superclasse
        
//      System.out.println(emp1.getSalario());
        System.out.println(emp1);
        
        Assalariado ass1; // variavel de subclasse
        
        ass1 = (Assalariado) emp1;
        // getNome() foi definido de superclasse (base)
        System.out.println(ass1.getSalario());
        // getSalario() foi definido da subclasse (derivada)
        System.out.println(ass1.getNome());
        
        System.out.println("------");
        
        Empregado emp2 = new Horista("Carlos", "456.453.343-02", 30, 12);
        Empregado emp3 = new Comissionado("Ana", "153.353.378-45", 10000, 15);
        Empregado emp4 = new ComissionadoAssalariado("Maria", "223.773.968-85", 10000, 15, 4000);
        
        Empregado[] folhaSalarial = new Empregado[100];
        
        folhaSalarial[0] = emp1;
        folhaSalarial[20] = emp2;
        folhaSalarial[21] = emp3;
        folhaSalarial[24] = emp4;
        
        System.out.println("Processamento de Folha Salarial Semanal");
        System.out.println("Nome\t\tProventos");
        for (int i = 0; i < folhaSalarial.length; i++) {
            if(folhaSalarial[i] != null) {
                
                
                if (folhaSalarial[i] instanceof ComissionadoAssalariado) {
                    ComissionadoAssalariado aux;
                    aux = (ComissionadoAssalariado) folhaSalarial[i];
                    
                    aux.setSalario(aux.getSalario() * 1.1);
                }
                
                System.out.println(folhaSalarial[i].getNome() + "\t\t" + folhaSalarial[i].proventoSemanal());
                
            }
        }
        
        System.out.println("-----");
        
        Empregado emp5 = new Horista("Jõao", "851.654.234-24", 25, 10);
        
        System.out.println(emp1);
        System.out.println(emp5);
        System.out.println(emp1.equals(emp5));
        
    }
}
