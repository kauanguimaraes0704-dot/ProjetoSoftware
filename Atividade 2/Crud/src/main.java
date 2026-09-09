import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GerenciarProdutos gerenciador = new GerenciarProdutos();

        int opcao;

        do {

            System.out.println("\n===== MENU DE OPÇÕES =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\n--- CADASTRAR PRODUTO ---");

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();

                    produto produto = new produto(nome, preco, quantidade);

                    gerenciador.cadastrarProduto(produto);

                    break;

                case 2:

                    System.out.println("\n--- LISTA DE PRODUTOS ---");

                    gerenciador.listarProdutos();

                    break;

                case 3:

                    System.out.println("\n--- ATUALIZAR PRODUTO ---");

                    gerenciador.listarProdutos();

                    System.out.print("Digite o ID do produto: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();

                    System.out.print("Novo preço: ");
                    double novoPreco = scanner.nextDouble();

                    System.out.print("Nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();

                    gerenciador.atualizarProduto(
                            idAtualizar,
                            novoNome,
                            novoPreco,
                            novaQuantidade
                    );

                    break;

                case 4:

                    System.out.println("\n--- REMOVER PRODUTO ---");

                    gerenciador.listarProdutos();

                    System.out.print("Digite o ID do produto que deseja remover: ");
                    int idRemover = scanner.nextInt();

                    gerenciador.removerProduto(idRemover);

                    break;

                case 5:

                    System.out.println("Programa encerrado!");

                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        } while (opcao != 5);

        scanner.close();
    }
}
 