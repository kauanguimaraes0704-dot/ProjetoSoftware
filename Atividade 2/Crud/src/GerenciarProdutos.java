import java.util.ArrayList;

public class GerenciarProdutos {

    private ArrayList<produto> produtos;

    public GerenciarProdutos() {
        produtos = new ArrayList<>();
    }

    public void cadastrarProduto(produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void listarProdutos() {

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        System.out.println("\n| ID | NOME | PREÇO | QUANTIDADE | VALOR EM ESTOQUE |");

        for (int i = 0; i < produtos.size(); i++) {

            produto produto = produtos.get(i);

            System.out.printf(
                    "| %d | %s | R$ %.2f | %d | R$ %.2f |%n",
                    i,
                    produto.getNome(),
                    produto.getPreco(),
                    produto.getQuantidade(),
                    produto.calcularValorEstoque()
            );
        }
    }

    public void atualizarProduto(int id, String nome, double preco, int quantidade) {

        if (id >= 0 && id < produtos.size()) {

            produto produto = produtos.get(id);

            produto.setNome(nome);
            produto.setPreco(preco);
            produto.setQuantidade(quantidade);

            System.out.println("Produto atualizado com sucesso!");

        } else {
            System.out.println("ID inválido!");
        }
    }

    public void removerProduto(int id) {

        if (id >= 0 && id < produtos.size()) {

            produtos.remove(id);

            System.out.println("Produto removido com sucesso!");

        } else {
            System.out.println("ID inválido!");
        }
    }
}
