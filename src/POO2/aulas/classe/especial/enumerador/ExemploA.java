package POO2.aulas.classe.especial.enumerador;

public class ExemploA {
    public static void main(String[] args) {
        
        System.out.println(FormaGeometricaA.Cor.VERMELHO);
        System.out.println(FormaGeometricaA.Cor.values()[0]);
        
        System.out.println("---");
        
        for (FormaGeometricaA.Cor c : FormaGeometricaA.Cor.values()) {
            System.out.println(c);
        }
        
        System.out.println("---");
        
        FormaGeometricaA quadrado = new FormaGeometricaA(FormaGeometricaA.Cor.VERMELHO, FormaGeometricaA.Cor.PRETO);
        
        System.out.println(quadrado.getCorBorda());
        System.out.println(quadrado.getCorBorda().name());
        System.out.println(quadrado.getCorBorda().ordinal());
    }
}
