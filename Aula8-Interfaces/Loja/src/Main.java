import entidades.Estagiario;
import entidades.Vendedor;
import entidades.Gerente;

public class Main {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("João", 2500, 10000);
        Gerente gerente = new Gerente("Maria", 3400, "Vendas");
        Estagiario estagiario = new Estagiario("Marcos", 2000, "UMC");

        System.out.println(vendedor);
        System.out.println(gerente);
        System.out.println(estagiario);
    }
}
