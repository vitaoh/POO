package POO2.exercicios.exerciciosB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class ListaDePalavras {
    
    private Map<String, Integer> palavras;

    public ListaDePalavras() {
        palavras = new HashMap<>();
    }
    
    public void adicionar(String palavra, int chave) {
        if(contem(palavra)) {
            int aux = palavras.get(palavra);
            palavras.put(palavra, aux + 1);
        } else {
            palavras.put(palavra, 1);
        }
    }
    
    public boolean remover(String palavra) {
        if(contem(palavra)) {
            int aux = palavras.get(palavra);
            if(aux == 1) {
                palavras.remove(palavra);
            }
            else {
                palavras.put(palavra, aux - 1);
            }
            return true;
        } else {
            return false;
        }
    }
    

    
    public int conta(String palavra) {
        if(contem(palavra)) {
            return palavras.get(palavra);
        } else return 0;
    }
    
    public boolean contem(String palavara) {
        return palavras.containsKey(palavara);
    }

    @Override
    public String toString() {
        return palavras.keySet().toString();
    }
    
    
    
    // Ex 12.22
    public static <T> List<T> removerRepetidos(List<T> lista) {
        return new ArrayList<>(new LinkedHashSet<>(lista));
    }
}
