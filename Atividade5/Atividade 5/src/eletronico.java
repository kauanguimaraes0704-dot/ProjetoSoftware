
public class eletronico extends produto {

    private int garantiaMeses;

    public eletronico(String nome, double preco,
                      int quantidadeEstoque, int garantiaMeses) {

        super(nome, preco, quantidadeEstoque);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Garantia: " + garantiaMeses + " meses");
    }
}
 