public class Roupas {
    private String marca;
    private String modelo;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupas(String marca, String modelo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double calcularValorTotal(){
        return quantidade * valor;
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade > 0){
            this.quantidade += quantidade;
            System.out.println("Peças adicionadas com sucesso!");
        } else {
            System.out.println("Produto Indisponível no Estoque!");
        }
    }

    public void removerEstoque(int quantidade){
        if(quantidade <= 0){
            System.out.println("Precisa ser maior do que 0 no estoque!");
        } else if (quantidade > this.quantidade){
            System.out.println("Não foi possível remover mais peças do Estoque!");
        } else {
            this.quantidade -= quantidade;
            System.out.println("Peça removida com sucesso!");
        }
    }

    public void Informações(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Unitário: R$ " + valor);
        System.out.println("Quantidade no Estoque: " + calcularValorTotal());

    }
}


