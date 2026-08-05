package filmes;

public class Filme {
    //Atributos
    String título;
    String Gênero;
    int anoLancamento;
    int duracao;

    //Ingressos
    int qtdIngresso;
    double precoIngresso;

    @Override
    public String toString() {
        return
                "\ntítulo='" + título +
                "\nGênero='" + Gênero +
                "\nanoLancamento=" + anoLancamento +
                "\nduracao=" + duracao +
                "\nqtdIngresso=" + qtdIngresso +
                "\nprecoIngresso=" + precoIngresso;
    }
}
