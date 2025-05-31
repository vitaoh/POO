package POO2.exercicios.exerciciosB;

import java.util.ArrayList;
import java.util.List;

public class MaquinaDeKaraoke {

    private List<String> musicas;

    public MaquinaDeKaraoke() {
        this.musicas = new ArrayList<>();
    }
    
    public void adicionarMusica(String musica) {
        musicas.add(musica);
    }
    
    public void exibirMusicas() {
        for (int i = 0; i < musicas.size(); i++) {
            System.out.println((i + 1) + " - " + musicas.get(i));
        }
    }
    
    public void adianta(String musica) {
        int i = musicas.indexOf(musica);
        if(i > 0) {
            String ant = musicas.get(i - 1);
            musicas.set(i - 1, musica);
            musicas.set(i, ant);
        }
    }
    
    public void adia(String musica) {
        int i = musicas.indexOf(musica);
        if(i >= 0 && i < musicas.size() - 1) {
            String seg = musicas.get(i + 1);
            musicas.set(i + 1, musica);
            musicas.set(i, seg);
        }
    }
}
