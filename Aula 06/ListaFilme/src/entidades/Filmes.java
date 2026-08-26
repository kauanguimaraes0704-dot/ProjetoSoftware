package entidades;

public class Filmes {
    private String titulo;
    private String genero;
    private int classificacao;
    private int duracao;

    //construtores
    public Filmes(String titulo, String genero, int classificacao, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = classificacao;
        this.duracao = duracao;
    }

    //getters e setters


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getClassificacao() {
        return classificacao;
    }


    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return titulo + " | " + genero + " | " + classificacao + " | " + duracao;

    }

}
