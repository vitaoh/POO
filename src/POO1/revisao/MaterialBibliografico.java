package POO1.revisao;
public abstract class MaterialBibliografico implements Emprestavel {

    private String localizacao;
    private String titulo;
    private String autores;
    private int edicao;
    private int ano;
    private int quantidade;

    public String getLocalizacao() {
        return localizacao;
    }

    private void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    private void setAutores(String autores) {
        this.autores = autores;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        if (edicao > 0) {
            this.edicao = edicao;
        }
    }

    public int getAno() { // voce nao pode mudar o ano de um livro publicado, por isso que fica private
        return ano;
    }

    public MaterialBibliografico(String localizacao, String titulo, String autores, int edicao, int ano, int quantidade) {
        setLocalizacao(localizacao);
        setTitulo(titulo);
        setAutores(autores);
        setEdicao(edicao);
        setAno(ano);
        setQuantidade(quantidade);
    }

    private void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    protected void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        }
    }

    @Override
    public String getObjeto() {
        return getTitulo();
    }

    @Override
    public boolean podeEmprestar() {
        if (getQuantidade() > 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean emprestar() {
        if (podeEmprestar()) {
            setQuantidade(getQuantidade() - 1);
            return true;
        } else {
            return false;
        }
    }
}
