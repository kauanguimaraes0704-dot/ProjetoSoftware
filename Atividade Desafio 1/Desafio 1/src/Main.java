import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Roupas roupa = null;
        int opcao;

        do {
            System.out.println("\n=====Gerenciamento de Estoque=====");
            System.out.println("1 - Cadastrar Roupa: ");
            System.out.println("2 - Adicionar Roupas ao Estoque: ");
            System.out.println("3 - Remover Roupas do Estoque: ");
            System.out.println("4 - Exibir Informações");
            System.out.println("0 - Sair");


            System.out.println("Escolha uma opcao: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\n=====Cadastro de Roupas=====");

                    System.out.println("Marca: ");
                    String marca = input.nextLine();

                    System.out.println("Modelo: ");
                    String modelo = input.nextLine();

                    System.out.println("Tamanho: ");
                    String tamanho = input.nextLine();

                    System.out.println("Quantidade: ");
                    int quantidade = input.nextInt();

                    System.out.println("Valor Unitário: ");
                    double valor = input.nextDouble();

                    roupa = new Roupas(marca, modelo, tamanho, quantidade, valor);

                    System.out.println("\n Roupa Cadastrada com sucesso!");

                    break;

                case 2:
                    if (roupa == null) {
                        System.out.println("Nenhum roupa cadastrada.");
                    } else {
                        System.out.println("Quantidade pra adicionar: ");
                        int adicionar = input.nextInt();

                        roupa.adicionarEstoque(adicionar);

                        System.out.println("\nInformações atualiazadas!");

                        roupa.Informações();
                    }

                    break;

                case 3:
                    if (roupa == null) {
                        System.out.println("Nenhum roupa cadastrada.");
                    } else {
                        System.out.println("Quantidade pra remover: ");
                        int remover = input.nextInt();

                        roupa.removerEstoque(remover);

                        System.out.println("\nInformações atualizadas!");

                        roupa.Informações();

                    }

                    break;

                case 4:
                    if (roupa == null) {
                        System.out.println("Nenhum roupa cadastrada.");
                    } else {
                        System.out.println("=====Informações da Roupa=====");
                        roupa.Informações();
                    }

                    break;

                case 0:
                    System.out.println("Programa finalizado!");
                    break;

            }

        } while (opcao != 0) ;

        input.close();

    }
}
