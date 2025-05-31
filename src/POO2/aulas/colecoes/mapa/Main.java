package POO2.aulas.colecoes.mapa;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // chave (imutável -> valor)
        Map<String, Number> notas = new HashMap<>();

        notas.put("João", 5.50);
        notas.put("João", 9.50);
        notas.put("João", 1.50);

        System.out.println(notas.get("João"));

        for (String chave : notas.keySet()) {
            double valor = (double) notas.get(chave);
            System.out.println(chave + " : " + valor);

            notas.put("João", 10.0);
            System.out.println(notas.get("João"));
        }

    }
}
