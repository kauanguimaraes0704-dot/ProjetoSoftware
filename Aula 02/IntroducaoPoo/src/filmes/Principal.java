package filmes;

public class Principal {
    public static void main(String[] args) {

        Filme homemAranha = new Filme();

        homemAranha.título = "Homem-Aranha: Um Novo Dia";
        homemAranha.Gênero = "Ação/Aventura";
        homemAranha.anoLancamento = 2026;
        homemAranha.duracao = 145;
        homemAranha.precoIngresso = 45;
        homemAranha.qtdIngresso = 5;

        Filme Rio = new Filme();

        Rio.título = "Rio 2";
        Rio.Gênero = "Infantil/Comédia";
        Rio.anoLancamento = 2014;
        Rio.duracao = 101;
        Rio.precoIngresso = 25;
        Rio.qtdIngresso = 15;

        System.out.println(Rio.toString());
        System.out.println(homemAranha.toString());

    }
}
