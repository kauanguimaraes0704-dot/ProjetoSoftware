import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String produto1 = sc.nextLine();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();
        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        double PrecoFinal = preco * quantidade;

        System.out.println("Produto: " + produto1
                + " quantidade: " + quantidade +
                " preco: " + preco +
                "Preço Final: " + PrecoFinal
        );

    }
}
