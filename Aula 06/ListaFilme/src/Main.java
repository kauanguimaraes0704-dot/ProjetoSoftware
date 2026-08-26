import entidades.Filmes;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Filmes> filmes = new ArrayList<>();

        while (true) {
            System.out.println("1 - CADASTRAR FILME");
            System.out.println("2 - LISTAR FILMES");
            System.out.println("3 - ATUALIZAR FILMES");
            System.out.println("4 - EXCLUIR FILME");
            System.out.println("5 - SAIR DO PROGRAMA");
            System.out.print("Digite uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("DIGITE O TÍTULO DO FILME: ");
                    String titulo = sc.nextLine();

                    System.out.println("DIGITE O GÊNERO DO FILME: ");
                    String genero = sc.nextLine();

                    System.out.println("DIGITE A DURAÇÃO DO FILME: ");
                    int duracao = sc.nextInt();

                    System.out.println("DIGITE A CLASSIFICAÇÃO INDICATIVA DO FILME: ");
                    int classificacao = sc.nextInt();
                    sc.nextLine();

                    Filmes filme = new Filmes(titulo, genero, classificacao, duracao);
                    filmes.add(filme);
                    break;

                    case "2":

                        if (filmes.isEmpty()) {
                            System.out.println("NENHUM FILME CADASTRADO");
                        } else  {
                            System.out.println("| ID | TÍTULO | GÊNERO | CLASSIFICAÇÃO | DURAÇÃO |");

                            for (int i = 0; i < filmes.size(); i++) {
                                System.out.println("| " + i + " | " + filmes.get(i).toString() + " |");

                            }
                        }
                        break;

                        case "3":
                            System.out.println("INFORME O ID DO FILME: ");
                            int idFilme = sc.nextInt();
                            sc.nextLine();

                            System.out.println("DIGITE O TITULO DO FILME: ");
                            String alterarTitulo = sc.nextLine();

                            System.out.println("DIGITE O GÊNERO DO FILME: ");
                            String alterarGenero = sc.nextLine();

                            System.out.println("DIGITE A DURACAO DO FILME: ");
                            int alterarDuracao = sc.nextInt();
                            sc.nextLine();

                            System.out.println("DIGITE A CLASSIFIAÇÃO DO FILME: ");
                            int alterarClassificacao = sc.nextInt();
                            sc.nextLine();

                            var alteraFilme = filmes.get(idFilme);

                            alteraFilme.setTitulo(alterarTitulo);
                            alteraFilme.setGenero(alterarGenero);
                            alteraFilme.setClassificacao(alterarDuracao);
                            alteraFilme.setDuracao(alterarDuracao);

                            System.out.println("Filme alterado com sucesso!");
                            break;

                            case "4":
                                System.out.println("INFORME O ID DO FILME: ");
                                int idFilme2 = sc.nextInt();
                                sc.nextLine();

                                filmes.remove(idFilme2);
                                break;

                                case "5":
                                    return;
            }
        }
    }
}
