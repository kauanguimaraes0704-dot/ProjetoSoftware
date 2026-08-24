import java.util.ArrayList;

public class ArrayListaNomes {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        //adicionando valores

        nomes.add("Alex");
        nomes.add("Bob");
        nomes.add("Carlos");
        nomes.add("Daniel");

        //adicionar valores em posições especificas

        nomes.add( 2,"Paulo");
        nomes.add(2,"Vitor");

        //verificar tamanho da lista
        System.out.println("O tamanho da lista é: " + nomes.size());

        //acessar o segundo nome da lista

        System.out.println("Segundo nome da lista: " + nomes.get(1));

        //Alterar um valor
        nomes.set(1, "Richard");
        System.out.println("Segundo nome da lista: " + nomes.get(1));

        //Encontrar uma posição a partir do seu valor
        System.out.println(nomes.indexOf("Richard"));

        //remover valores da lista
        nomes.remove(1); //posição
        nomes.remove("Richard"); //valor

        //forEach

        for(String nome : nomes) {
            System.out.println(nome);
        }

        //função anonima

        nomes.removeIf(nome -> nome.contains("D"));

        for(String nome : nomes) {
            System.out.println(nome);
        }



    }
}
