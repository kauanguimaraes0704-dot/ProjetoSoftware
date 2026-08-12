import entidades.filme;

public class main {

    public static void main(String[] args) {
        filme filme = new filme("Homem Aranha", "Ação", "Dan Slott", 115, 35, 50);

        System.out.println("Nome do Filme: " + filme.getTitulo());
        System.out.println("Valor do Filme: " + filme.getValor());

        filme.setValor(50);

        System.out.println("Valor do Filme: " + filme.getValor());
    }
}
