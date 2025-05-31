package POO1.revisao;

public class Revista extends MaterialBibliografico{

    public Revista(String localizacao, String titulo, String autores, int edicao, int ano) {
        super(localizacao, titulo, autores, edicao, ano, 3);
    }

    @Override
    public boolean devolver() {
        if(getQuantidade() < 3) {
            setQuantidade(getQuantidade() + 1);
            return true;
        } else return false;
    }
    
}
