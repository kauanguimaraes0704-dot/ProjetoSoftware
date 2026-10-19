
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<produto> produtos = new ArrayList<>();

        int opcao = 0;

        while (opcao != 7) {

            System.out.println("\n=== LOJA DE INFORMATICA ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Cadastrar eletronico");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Alterar preco");
            System.out.println("5 - Excluir produto");
            System.out.println("6 - Realizar venda");
            System.out.println("7 - Sair");
            System.out.print("Escolha: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = entrada.nextLine();

                    System.out.print("Preco: ");
                    double preco = entrada.nextDouble();

                    System.out.print("Quantidade em estoque: ");
                    int estoque = entrada.nextInt();

                    if (preco > 0 && estoque >= 0) {
                        produto p = new produto(nome, preco, estoque);
                        produtos.add(p);
                        System.out.println("Produto cadastrado!");
                    } else {
                        System.out.println("Preco ou estoque invalido!");
                    }
                    break;

                case 2:
                    System.out.print("Nome do eletronico: ");
                    String nomeE = entrada.nextLine();

                    System.out.print("Preco: ");
                    double precoE = entrada.nextDouble();

                    System.out.print("Quantidade em estoque: ");
                    int estoqueE = entrada.nextInt();

                    System.out.print("Garantia em meses: ");
                    int garantia = entrada.nextInt();

                    if (precoE > 0 && estoqueE >= 0 && garantia >= 0) {
                        eletronico e = new eletronico(
                                nomeE, precoE, estoqueE, garantia
                        );
                        produtos.add(e);
                        System.out.println("Eletronico cadastrado!");
                    } else {
                        System.out.println("Dados invalidos!");
                    }
                    break;

                case 3:
                    if (produtos.size() == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println("\nPosicao: " + (i + 1));
                            produtos.get(i).exibirInformacoes();
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite a posicao do produto: ");
                    int posicao = entrada.nextInt();

                    if (posicao >= 1 && posicao <= produtos.size()) {
                        System.out.print("Novo preco: ");
                        double novoPreco = entrada.nextDouble();

                        if (novoPreco > 0) {
                            produtos.get(posicao - 1).setPreco(novoPreco);
                            System.out.println("Preco alterado!");
                        } else {
                            System.out.println("Preco invalido!");
                        }
                    } else {
                        System.out.println("Posicao inexistente!");
                    }
                    break;

                case 5:
                    System.out.print("Digite a posicao para excluir: ");
                    int excluir = entrada.nextInt();

                    if (excluir >= 1 && excluir <= produtos.size()) {
                        produtos.remove(excluir - 1);
                        System.out.println("Produto excluido!");
                    } else {
                        System.out.println("Posicao inexistente!");
                    }
                    break;

                case 6:
                    System.out.print("Digite a posicao do produto: ");
                    int venda = entrada.nextInt();

                    if (venda >= 1 && venda <= produtos.size()) {

                        System.out.print("Quantidade para vender: ");
                        int quantidade = entrada.nextInt();

                        produto p = produtos.get(venda - 1);

                        if (p.vender(quantidade)) {
                            System.out.println(
                                    "Valor total: R$ " +
                                            p.calcularTotal(quantidade)
                            );
                            System.out.println("Venda realizada!");
                            System.out.println(
                                    "Estoque restante: " +
                                            p.getQuantidadeEstoque()
                            );
                        } else {
                            System.out.println(
                                    "Quantidade invalida ou estoque insuficiente!"
                            );
                        }

                    } else {
                        System.out.println("Posicao inexistente!");
                    }
                    break;

                case 7:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        }

        entrada.close();
    }
}