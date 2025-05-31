package POO2.aulas.colecoes.mapa;

import POO2.aulas.colecoes.Pessoa;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        
        Map<String, Pessoa> funcionarios = new HashMap<>();
        
        funcionarios.put("555.999.111-22", new Pessoa("Joao", 21));
        funcionarios.put("555.444.111-22", new Pessoa("Maria", 27));
    }
}
