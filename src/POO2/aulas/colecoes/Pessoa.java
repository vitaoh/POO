package POO2.aulas.colecoes;

public class Pessoa implements Comparable<Pessoa>{
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        } else{
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        } else{
            throw new IllegalArgumentException("A idade não pode ser menor do que zero");
        }
    }
    
    @Override // herdado da classe Object
    public String toString(){
        return getNome() + " ( " + getIdade() + " )";
    }
    
    @Override // herdado da classe Comparable
    public int compareTo(Pessoa p){
        if( getIdade() == p.getIdade() ) {
            return 0;
        } else{
            if( getIdade() > p.getIdade() ) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
